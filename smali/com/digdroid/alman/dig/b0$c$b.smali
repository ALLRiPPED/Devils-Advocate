.class Lcom/digdroid/alman/dig/b0$c$b;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Landroid/content/DialogInterface$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/digdroid/alman/dig/b0$c;->a(Ljava/lang/String;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:[Ljava/io/File;

.field final synthetic c:Ljava/lang/String;

.field final synthetic d:Lcom/digdroid/alman/dig/b0$c;


# direct methods
.method constructor <init>(Lcom/digdroid/alman/dig/b0$c;[Ljava/io/File;Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lcom/digdroid/alman/dig/b0$c$b;->d:Lcom/digdroid/alman/dig/b0$c;

    iput-object p2, p0, Lcom/digdroid/alman/dig/b0$c$b;->b:[Ljava/io/File;

    iput-object p3, p0, Lcom/digdroid/alman/dig/b0$c$b;->c:Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/content/DialogInterface;I)V
    .locals 5

    iget-object p1, p0, Lcom/digdroid/alman/dig/b0$c$b;->d:Lcom/digdroid/alman/dig/b0$c;

    iget-object v0, p1, Lcom/digdroid/alman/dig/b0$c;->d:Lcom/digdroid/alman/dig/b0;

    iget-object v1, p1, Lcom/digdroid/alman/dig/b0$c;->c:Lcom/digdroid/alman/dig/x3;

    iget-object v2, p1, Lcom/digdroid/alman/dig/b0$c;->a:Landroid/database/Cursor;

    iget-object p1, p1, Lcom/digdroid/alman/dig/b0$c;->b:Landroid/database/Cursor;

    iget-object v3, p0, Lcom/digdroid/alman/dig/b0$c$b;->b:[Ljava/io/File;

    array-length v4, v3

    if-ne p2, v4, :cond_0

    iget-object p2, p0, Lcom/digdroid/alman/dig/b0$c$b;->c:Ljava/lang/String;

    goto :goto_0

    :cond_0
    aget-object p2, v3, p2

    invoke-virtual {p2}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object p2

    :goto_0
    invoke-virtual {v0, v1, v2, p1, p2}, Lcom/digdroid/alman/dig/b0;->s(Lcom/digdroid/alman/dig/x3;Landroid/database/Cursor;Landroid/database/Cursor;Ljava/lang/String;)V

    return-void
.end method
