.class Lcom/digdroid/alman/dig/t1$j$a;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Landroid/content/DialogInterface$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/digdroid/alman/dig/t1$j;->onPreExecute()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lcom/digdroid/alman/dig/t1$j;


# direct methods
.method constructor <init>(Lcom/digdroid/alman/dig/t1$j;)V
    .locals 0

    iput-object p1, p0, Lcom/digdroid/alman/dig/t1$j$a;->b:Lcom/digdroid/alman/dig/t1$j;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/content/DialogInterface;I)V
    .locals 0

    iget-object p1, p0, Lcom/digdroid/alman/dig/t1$j$a;->b:Lcom/digdroid/alman/dig/t1$j;

    const/4 p2, 0x1

    invoke-virtual {p1, p2}, Landroid/os/AsyncTask;->cancel(Z)Z

    return-void
.end method
