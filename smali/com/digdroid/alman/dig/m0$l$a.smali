.class Lcom/digdroid/alman/dig/m0$l$a;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Landroid/content/DialogInterface$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/digdroid/alman/dig/m0$l;->a()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lcom/digdroid/alman/dig/m0$l;


# direct methods
.method constructor <init>(Lcom/digdroid/alman/dig/m0$l;)V
    .locals 0

    iput-object p1, p0, Lcom/digdroid/alman/dig/m0$l$a;->b:Lcom/digdroid/alman/dig/m0$l;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/content/DialogInterface;I)V
    .locals 2

    iget-object p1, p0, Lcom/digdroid/alman/dig/m0$l$a;->b:Lcom/digdroid/alman/dig/m0$l;

    iget-object p1, p1, Lcom/digdroid/alman/dig/m0$l;->a:Lcom/digdroid/alman/dig/m0;

    iget-object p1, p1, Lcom/digdroid/alman/dig/m0;->c:Landroid/database/sqlite/SQLiteDatabase;

    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "UPDATE roms SET ignored=1 WHERE _id="

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v0, p0, Lcom/digdroid/alman/dig/m0$l$a;->b:Lcom/digdroid/alman/dig/m0$l;

    iget-object v0, v0, Lcom/digdroid/alman/dig/m0$l;->a:Lcom/digdroid/alman/dig/m0;

    iget-wide v0, v0, Lcom/digdroid/alman/dig/m0;->b:J

    invoke-virtual {p2, v0, v1}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Landroid/database/sqlite/SQLiteDatabase;->execSQL(Ljava/lang/String;)V

    iget-object p1, p0, Lcom/digdroid/alman/dig/m0$l$a;->b:Lcom/digdroid/alman/dig/m0$l;

    iget-object p1, p1, Lcom/digdroid/alman/dig/m0$l;->a:Lcom/digdroid/alman/dig/m0;

    iget-object p1, p1, Lcom/digdroid/alman/dig/m0;->a:Landroid/app/Activity;

    invoke-static {p1}, Lcom/digdroid/alman/dig/u;->e(Landroid/content/Context;)Lcom/digdroid/alman/dig/u;

    move-result-object p2

    invoke-static {p1, p2}, Lcom/digdroid/alman/dig/o0;->g(Landroid/content/Context;Lcom/digdroid/alman/dig/u;)Lcom/digdroid/alman/dig/o0;

    move-result-object p1

    iget-object p2, p0, Lcom/digdroid/alman/dig/m0$l$a;->b:Lcom/digdroid/alman/dig/m0$l;

    iget-object p2, p2, Lcom/digdroid/alman/dig/m0$l;->a:Lcom/digdroid/alman/dig/m0;

    iget-wide v0, p2, Lcom/digdroid/alman/dig/m0;->b:J

    invoke-virtual {p1, v0, v1}, Lcom/digdroid/alman/dig/o0;->t(J)V

    iget-object p1, p0, Lcom/digdroid/alman/dig/m0$l$a;->b:Lcom/digdroid/alman/dig/m0$l;

    iget-object p1, p1, Lcom/digdroid/alman/dig/m0$l;->a:Lcom/digdroid/alman/dig/m0;

    iget-object p1, p1, Lcom/digdroid/alman/dig/m0;->d:Lcom/digdroid/alman/dig/m0$p;

    invoke-interface {p1}, Lcom/digdroid/alman/dig/m0$p;->a()V

    return-void
.end method
