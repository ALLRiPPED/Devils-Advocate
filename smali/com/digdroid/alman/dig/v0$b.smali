.class Lcom/digdroid/alman/dig/v0$b;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/digdroid/alman/dig/v0;->l()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lcom/digdroid/alman/dig/v0;


# direct methods
.method constructor <init>(Lcom/digdroid/alman/dig/v0;)V
    .locals 0

    iput-object p1, p0, Lcom/digdroid/alman/dig/v0$b;->b:Lcom/digdroid/alman/dig/v0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 1

    iget-object v0, p0, Lcom/digdroid/alman/dig/v0$b;->b:Lcom/digdroid/alman/dig/v0;

    invoke-static {v0}, Lcom/digdroid/alman/dig/v0;->b(Lcom/digdroid/alman/dig/v0;)Lcom/digdroid/alman/dig/o2;

    move-result-object v0

    invoke-virtual {v0}, Lcom/digdroid/alman/dig/o2;->w()V

    return-void
.end method
