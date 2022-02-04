package com.bumptech.glide.p135m;

import android.annotation.TargetApi;
import android.os.Build;
import android.os.StrictMode;
import java.io.BufferedWriter;
import java.io.Closeable;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.PrintStream;
import java.io.Writer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.concurrent.Callable;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* renamed from: com.bumptech.glide.m.a */
public final class C1987a implements Closeable {

    /* renamed from: b */
    private final File f7325b;

    /* renamed from: c */
    private final File f7326c;

    /* renamed from: d */
    private final File f7327d;

    /* renamed from: e */
    private final File f7328e;

    /* renamed from: f */
    private final int f7329f;

    /* renamed from: g */
    private long f7330g;

    /* renamed from: h */
    private final int f7331h;

    /* renamed from: i */
    private long f7332i = 0;

    /* renamed from: j */
    private Writer f7333j;

    /* renamed from: k */
    private final LinkedHashMap<String, C1991d> f7334k = new LinkedHashMap<>(0, 0.75f, true);

    /* renamed from: l */
    private int f7335l;

    /* renamed from: m */
    private long f7336m = 0;

    /* renamed from: n */
    final ThreadPoolExecutor f7337n = new ThreadPoolExecutor(0, 1, 60, TimeUnit.SECONDS, new LinkedBlockingQueue(), new ThreadFactoryC1989b(null));

    /* renamed from: o */
    private final Callable<Void> f7338o = new CallableC1988a();

    /* access modifiers changed from: package-private */
    /* renamed from: com.bumptech.glide.m.a$a */
    public class CallableC1988a implements Callable<Void> {
        CallableC1988a() {
        }

        /* renamed from: a */
        public Void call() {
            synchronized (C1987a.this) {
                if (C1987a.this.f7333j == null) {
                    return null;
                }
                C1987a.this.m8981z();
                if (C1987a.this.m8974r()) {
                    C1987a.this.m8979w();
                    C1987a.this.f7335l = 0;
                }
                return null;
            }
        }
    }

    /* renamed from: com.bumptech.glide.m.a$b */
    private static final class ThreadFactoryC1989b implements ThreadFactory {
        private ThreadFactoryC1989b() {
        }

        /* synthetic */ ThreadFactoryC1989b(CallableC1988a aVar) {
            this();
        }

        public synchronized Thread newThread(Runnable runnable) {
            Thread thread;
            thread = new Thread(runnable, "glide-disk-lru-cache-thread");
            thread.setPriority(1);
            return thread;
        }
    }

    /* renamed from: com.bumptech.glide.m.a$c */
    public final class C1990c {

        /* renamed from: a */
        private final C1991d f7340a;

        /* renamed from: b */
        private final boolean[] f7341b;

        /* renamed from: c */
        private boolean f7342c;

        private C1990c(C1991d dVar) {
            this.f7340a = dVar;
            this.f7341b = dVar.f7348e ? null : new boolean[C1987a.this.f7331h];
        }

        /* synthetic */ C1990c(C1987a aVar, C1991d dVar, CallableC1988a aVar2) {
            this(dVar);
        }

        /* renamed from: a */
        public void mo7637a() {
            C1987a.this.m8970k(this, false);
        }

        /* renamed from: b */
        public void mo7638b() {
            if (!this.f7342c) {
                try {
                    mo7637a();
                } catch (IOException unused) {
                }
            }
        }

        /* renamed from: e */
        public void mo7639e() {
            C1987a.this.m8970k(this, true);
            this.f7342c = true;
        }

        /* renamed from: f */
        public File mo7640f(int i) {
            File k;
            synchronized (C1987a.this) {
                if (this.f7340a.f7349f == this) {
                    if (!this.f7340a.f7348e) {
                        this.f7341b[i] = true;
                    }
                    k = this.f7340a.mo7642k(i);
                    if (!C1987a.this.f7325b.exists()) {
                        C1987a.this.f7325b.mkdirs();
                    }
                } else {
                    throw new IllegalStateException();
                }
            }
            return k;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: com.bumptech.glide.m.a$d */
    public final class C1991d {

        /* renamed from: a */
        private final String f7344a;

        /* renamed from: b */
        private final long[] f7345b;

        /* renamed from: c */
        File[] f7346c;

        /* renamed from: d */
        File[] f7347d;

        /* renamed from: e */
        private boolean f7348e;

        /* renamed from: f */
        private C1990c f7349f;

        /* renamed from: g */
        private long f7350g;

        private C1991d(String str) {
            this.f7344a = str;
            this.f7345b = new long[C1987a.this.f7331h];
            this.f7346c = new File[C1987a.this.f7331h];
            this.f7347d = new File[C1987a.this.f7331h];
            StringBuilder sb = new StringBuilder(str);
            sb.append('.');
            int length = sb.length();
            for (int i = 0; i < C1987a.this.f7331h; i++) {
                sb.append(i);
                this.f7346c[i] = new File(C1987a.this.f7325b, sb.toString());
                sb.append(".tmp");
                this.f7347d[i] = new File(C1987a.this.f7325b, sb.toString());
                sb.setLength(length);
            }
        }

        /* synthetic */ C1991d(C1987a aVar, String str, CallableC1988a aVar2) {
            this(str);
        }

        /* renamed from: m */
        private IOException m9002m(String[] strArr) {
            throw new IOException("unexpected journal line: " + Arrays.toString(strArr));
        }

        /* access modifiers changed from: private */
        /* access modifiers changed from: public */
        /* renamed from: n */
        private void m9003n(String[] strArr) {
            if (strArr.length == C1987a.this.f7331h) {
                for (int i = 0; i < strArr.length; i++) {
                    try {
                        this.f7345b[i] = Long.parseLong(strArr[i]);
                    } catch (NumberFormatException unused) {
                        throw m9002m(strArr);
                    }
                }
                return;
            }
            throw m9002m(strArr);
        }

        /* renamed from: j */
        public File mo7641j(int i) {
            return this.f7346c[i];
        }

        /* renamed from: k */
        public File mo7642k(int i) {
            return this.f7347d[i];
        }

        /* renamed from: l */
        public String mo7643l() {
            StringBuilder sb = new StringBuilder();
            long[] jArr = this.f7345b;
            for (long j : jArr) {
                sb.append(' ');
                sb.append(j);
            }
            return sb.toString();
        }
    }

    /* renamed from: com.bumptech.glide.m.a$e */
    public final class C1992e {

        /* renamed from: a */
        private final String f7352a;

        /* renamed from: b */
        private final long f7353b;

        /* renamed from: c */
        private final long[] f7354c;

        /* renamed from: d */
        private final File[] f7355d;

        private C1992e(String str, long j, File[] fileArr, long[] jArr) {
            this.f7352a = str;
            this.f7353b = j;
            this.f7355d = fileArr;
            this.f7354c = jArr;
        }

        /* synthetic */ C1992e(C1987a aVar, String str, long j, File[] fileArr, long[] jArr, CallableC1988a aVar2) {
            this(str, j, fileArr, jArr);
        }

        /* renamed from: a */
        public File mo7644a(int i) {
            return this.f7355d[i];
        }
    }

    private C1987a(File file, int i, int i2, long j) {
        this.f7325b = file;
        this.f7329f = i;
        this.f7326c = new File(file, "journal");
        this.f7327d = new File(file, "journal.tmp");
        this.f7328e = new File(file, "journal.bkp");
        this.f7331h = i2;
        this.f7330g = j;
    }

    /* renamed from: i */
    private void m8968i() {
        if (this.f7333j == null) {
            throw new IllegalStateException("cache is closed");
        }
    }

    @TargetApi(26)
    /* renamed from: j */
    private static void m8969j(Writer writer) {
        if (Build.VERSION.SDK_INT < 26) {
            writer.close();
            return;
        }
        StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
        StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).permitUnbufferedIo().build());
        try {
            writer.close();
        } finally {
            StrictMode.setThreadPolicy(threadPolicy);
        }
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* renamed from: k */
    private synchronized void m8970k(C1990c cVar, boolean z) {
        C1991d dVar = cVar.f7340a;
        if (dVar.f7349f == cVar) {
            if (z && !dVar.f7348e) {
                for (int i = 0; i < this.f7331h; i++) {
                    if (!cVar.f7341b[i]) {
                        cVar.mo7637a();
                        throw new IllegalStateException("Newly created entry didn't create value for index " + i);
                    } else if (!dVar.mo7642k(i).exists()) {
                        cVar.mo7637a();
                        return;
                    }
                }
            }
            for (int i2 = 0; i2 < this.f7331h; i2++) {
                File k = dVar.mo7642k(i2);
                if (!z) {
                    m8971m(k);
                } else if (k.exists()) {
                    File j = dVar.mo7641j(i2);
                    k.renameTo(j);
                    long j2 = dVar.f7345b[i2];
                    long length = j.length();
                    dVar.f7345b[i2] = length;
                    this.f7332i = (this.f7332i - j2) + length;
                }
            }
            this.f7335l++;
            dVar.f7349f = null;
            if (dVar.f7348e || z) {
                dVar.f7348e = true;
                this.f7333j.append((CharSequence) "CLEAN");
                this.f7333j.append(' ');
                this.f7333j.append((CharSequence) dVar.f7344a);
                this.f7333j.append((CharSequence) dVar.mo7643l());
                this.f7333j.append('\n');
                if (z) {
                    long j3 = this.f7336m;
                    this.f7336m = 1 + j3;
                    dVar.f7350g = j3;
                }
            } else {
                this.f7334k.remove(dVar.f7344a);
                this.f7333j.append((CharSequence) "REMOVE");
                this.f7333j.append(' ');
                this.f7333j.append((CharSequence) dVar.f7344a);
                this.f7333j.append('\n');
            }
            m8973p(this.f7333j);
            if (this.f7332i > this.f7330g || m8974r()) {
                this.f7337n.submit(this.f7338o);
            }
            return;
        }
        throw new IllegalStateException();
    }

    /* renamed from: m */
    private static void m8971m(File file) {
        if (file.exists() && !file.delete()) {
            throw new IOException();
        }
    }

    /* renamed from: o */
    private synchronized C1990c m8972o(String str, long j) {
        m8968i();
        C1991d dVar = this.f7334k.get(str);
        if (j != -1 && (dVar == null || dVar.f7350g != j)) {
            return null;
        }
        if (dVar == null) {
            dVar = new C1991d(this, str, null);
            this.f7334k.put(str, dVar);
        } else if (dVar.f7349f != null) {
            return null;
        }
        C1990c cVar = new C1990c(this, dVar, null);
        dVar.f7349f = cVar;
        this.f7333j.append((CharSequence) "DIRTY");
        this.f7333j.append(' ');
        this.f7333j.append((CharSequence) str);
        this.f7333j.append('\n');
        m8973p(this.f7333j);
        return cVar;
    }

    @TargetApi(26)
    /* renamed from: p */
    private static void m8973p(Writer writer) {
        if (Build.VERSION.SDK_INT < 26) {
            writer.flush();
            return;
        }
        StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
        StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).permitUnbufferedIo().build());
        try {
            writer.flush();
        } finally {
            StrictMode.setThreadPolicy(threadPolicy);
        }
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* renamed from: r */
    private boolean m8974r() {
        int i = this.f7335l;
        return i >= 2000 && i >= this.f7334k.size();
    }

    /* renamed from: s */
    public static C1987a m8975s(File file, int i, int i2, long j) {
        if (j <= 0) {
            throw new IllegalArgumentException("maxSize <= 0");
        } else if (i2 > 0) {
            File file2 = new File(file, "journal.bkp");
            if (file2.exists()) {
                File file3 = new File(file, "journal");
                if (file3.exists()) {
                    file2.delete();
                } else {
                    m8980y(file2, file3, false);
                }
            }
            C1987a aVar = new C1987a(file, i, i2, j);
            if (aVar.f7326c.exists()) {
                try {
                    aVar.m8977u();
                    aVar.m8976t();
                    return aVar;
                } catch (IOException e) {
                    PrintStream printStream = System.out;
                    printStream.println("DiskLruCache " + file + " is corrupt: " + e.getMessage() + ", removing");
                    aVar.mo7630l();
                }
            }
            file.mkdirs();
            C1987a aVar2 = new C1987a(file, i, i2, j);
            aVar2.m8979w();
            return aVar2;
        } else {
            throw new IllegalArgumentException("valueCount <= 0");
        }
    }

    /* renamed from: t */
    private void m8976t() {
        m8971m(this.f7327d);
        Iterator<C1991d> it = this.f7334k.values().iterator();
        while (it.hasNext()) {
            C1991d next = it.next();
            int i = 0;
            if (next.f7349f == null) {
                while (i < this.f7331h) {
                    this.f7332i += next.f7345b[i];
                    i++;
                }
            } else {
                next.f7349f = null;
                while (i < this.f7331h) {
                    m8971m(next.mo7641j(i));
                    m8971m(next.mo7642k(i));
                    i++;
                }
                it.remove();
            }
        }
    }

    /* renamed from: u */
    private void m8977u() {
        C1993b bVar = new C1993b(new FileInputStream(this.f7326c), C1995c.f7363a);
        try {
            String d = bVar.mo7647d();
            String d2 = bVar.mo7647d();
            String d3 = bVar.mo7647d();
            String d4 = bVar.mo7647d();
            String d5 = bVar.mo7647d();
            if (!"libcore.io.DiskLruCache".equals(d) || !"1".equals(d2) || !Integer.toString(this.f7329f).equals(d3) || !Integer.toString(this.f7331h).equals(d4) || !"".equals(d5)) {
                throw new IOException("unexpected journal header: [" + d + ", " + d2 + ", " + d4 + ", " + d5 + "]");
            }
            int i = 0;
            while (true) {
                try {
                    m8978v(bVar.mo7647d());
                    i++;
                } catch (EOFException unused) {
                    this.f7335l = i - this.f7334k.size();
                    if (bVar.mo7645c()) {
                        m8979w();
                    } else {
                        this.f7333j = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.f7326c, true), C1995c.f7363a));
                    }
                    return;
                }
            }
        } finally {
            C1995c.m9012a(bVar);
        }
    }

    /* renamed from: v */
    private void m8978v(String str) {
        String str2;
        int indexOf = str.indexOf(32);
        if (indexOf != -1) {
            int i = indexOf + 1;
            int indexOf2 = str.indexOf(32, i);
            if (indexOf2 == -1) {
                str2 = str.substring(i);
                if (indexOf == 6 && str.startsWith("REMOVE")) {
                    this.f7334k.remove(str2);
                    return;
                }
            } else {
                str2 = str.substring(i, indexOf2);
            }
            C1991d dVar = this.f7334k.get(str2);
            if (dVar == null) {
                dVar = new C1991d(this, str2, null);
                this.f7334k.put(str2, dVar);
            }
            if (indexOf2 != -1 && indexOf == 5 && str.startsWith("CLEAN")) {
                String[] split = str.substring(indexOf2 + 1).split(" ");
                dVar.f7348e = true;
                dVar.f7349f = null;
                dVar.m9003n(split);
            } else if (indexOf2 == -1 && indexOf == 5 && str.startsWith("DIRTY")) {
                dVar.f7349f = new C1990c(this, dVar, null);
            } else if (indexOf2 != -1 || indexOf != 4 || !str.startsWith("READ")) {
                throw new IOException("unexpected journal line: " + str);
            }
        } else {
            throw new IOException("unexpected journal line: " + str);
        }
    }

    /* JADX INFO: finally extract failed */
    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* renamed from: w */
    private synchronized void m8979w() {
        Writer writer = this.f7333j;
        if (writer != null) {
            m8969j(writer);
        }
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.f7327d), C1995c.f7363a));
        try {
            bufferedWriter.write("libcore.io.DiskLruCache");
            bufferedWriter.write("\n");
            bufferedWriter.write("1");
            bufferedWriter.write("\n");
            bufferedWriter.write(Integer.toString(this.f7329f));
            bufferedWriter.write("\n");
            bufferedWriter.write(Integer.toString(this.f7331h));
            bufferedWriter.write("\n");
            bufferedWriter.write("\n");
            for (C1991d dVar : this.f7334k.values()) {
                bufferedWriter.write(dVar.f7349f != null ? "DIRTY " + dVar.f7344a + '\n' : "CLEAN " + dVar.f7344a + dVar.mo7643l() + '\n');
            }
            m8969j(bufferedWriter);
            if (this.f7326c.exists()) {
                m8980y(this.f7326c, this.f7328e, true);
            }
            m8980y(this.f7327d, this.f7326c, false);
            this.f7328e.delete();
            this.f7333j = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.f7326c, true), C1995c.f7363a));
        } catch (Throwable th) {
            m8969j(bufferedWriter);
            throw th;
        }
    }

    /* renamed from: y */
    private static void m8980y(File file, File file2, boolean z) {
        if (z) {
            m8971m(file2);
        }
        if (!file.renameTo(file2)) {
            throw new IOException();
        }
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* renamed from: z */
    private void m8981z() {
        while (this.f7332i > this.f7330g) {
            mo7633x(this.f7334k.entrySet().iterator().next().getKey());
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() {
        if (this.f7333j != null) {
            Iterator it = new ArrayList(this.f7334k.values()).iterator();
            while (it.hasNext()) {
                C1991d dVar = (C1991d) it.next();
                if (dVar.f7349f != null) {
                    dVar.f7349f.mo7637a();
                }
            }
            m8981z();
            m8969j(this.f7333j);
            this.f7333j = null;
        }
    }

    /* renamed from: l */
    public void mo7630l() {
        close();
        C1995c.m9013b(this.f7325b);
    }

    /* renamed from: n */
    public C1990c mo7631n(String str) {
        return m8972o(str, -1);
    }

    /* renamed from: q */
    public synchronized C1992e mo7632q(String str) {
        m8968i();
        C1991d dVar = this.f7334k.get(str);
        if (dVar == null) {
            return null;
        }
        if (!dVar.f7348e) {
            return null;
        }
        for (File file : dVar.f7346c) {
            if (!file.exists()) {
                return null;
            }
        }
        this.f7335l++;
        this.f7333j.append((CharSequence) "READ");
        this.f7333j.append(' ');
        this.f7333j.append((CharSequence) str);
        this.f7333j.append('\n');
        if (m8974r()) {
            this.f7337n.submit(this.f7338o);
        }
        return new C1992e(this, str, dVar.f7350g, dVar.f7346c, dVar.f7345b, null);
    }

    /* renamed from: x */
    public synchronized boolean mo7633x(String str) {
        m8968i();
        C1991d dVar = this.f7334k.get(str);
        if (dVar != null) {
            if (dVar.f7349f == null) {
                for (int i = 0; i < this.f7331h; i++) {
                    File j = dVar.mo7641j(i);
                    if (j.exists()) {
                        if (!j.delete()) {
                            throw new IOException("failed to delete " + j);
                        }
                    }
                    this.f7332i -= dVar.f7345b[i];
                    dVar.f7345b[i] = 0;
                }
                this.f7335l++;
                this.f7333j.append((CharSequence) "REMOVE");
                this.f7333j.append(' ');
                this.f7333j.append((CharSequence) str);
                this.f7333j.append('\n');
                this.f7334k.remove(str);
                if (m8974r()) {
                    this.f7337n.submit(this.f7338o);
                }
                return true;
            }
        }
        return false;
    }
}
