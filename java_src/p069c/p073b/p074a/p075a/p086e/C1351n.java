package p069c.p073b.p074a.p075a.p086e;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.p147v.C3032b;

/* renamed from: c.b.a.a.e.n */
public final class C1351n implements Parcelable.Creator<C1350m> {
    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ C1350m createFromParcel(Parcel parcel) {
        int q = C3032b.m12409q(parcel);
        int i = 0;
        boolean z = false;
        while (parcel.dataPosition() < q) {
            int k = C3032b.m12403k(parcel);
            int i2 = C3032b.m12401i(k);
            if (i2 == 2) {
                i = C3032b.m12405m(parcel, k);
            } else if (i2 != 3) {
                C3032b.m12408p(parcel, k);
            } else {
                z = C3032b.m12402j(parcel, k);
            }
        }
        C3032b.m12400h(parcel, q);
        return new C1350m(i, z);
    }

    /* Return type fixed from 'java.lang.Object[]' to match base method */
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ C1350m[] newArray(int i) {
        return new C1350m[i];
    }
}
