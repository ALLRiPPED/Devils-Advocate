.class Lcom/digdroid/alman/dig/v0$d;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Landroid/widget/CompoundButton$OnCheckedChangeListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/digdroid/alman/dig/v0;->c()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/digdroid/alman/dig/v0;


# direct methods
.method constructor <init>(Lcom/digdroid/alman/dig/v0;)V
    .locals 0

    iput-object p1, p0, Lcom/digdroid/alman/dig/v0$d;->a:Lcom/digdroid/alman/dig/v0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onCheckedChanged(Landroid/widget/CompoundButton;Z)V
    .locals 1

    iget-object p1, p0, Lcom/digdroid/alman/dig/v0$d;->a:Lcom/digdroid/alman/dig/v0;

    iput-boolean p2, p1, Lcom/digdroid/alman/dig/v0;->g:Z

    iget-object p1, p1, Lcom/digdroid/alman/dig/v0;->f:Lcom/digdroid/alman/dig/b3;

    const-string v0, "games_preview_enabled"

    invoke-virtual {p1, v0, p2}, Lcom/digdroid/alman/dig/b3;->B(Ljava/lang/String;Z)V

    iget-object p1, p0, Lcom/digdroid/alman/dig/v0$d;->a:Lcom/digdroid/alman/dig/v0;

    invoke-virtual {p1}, Lcom/digdroid/alman/dig/v0;->h()V

    iget-object p1, p0, Lcom/digdroid/alman/dig/v0$d;->a:Lcom/digdroid/alman/dig/v0;

    iget-object p1, p1, Lcom/digdroid/alman/dig/v0;->a:Lcom/digdroid/alman/dig/r1;

    invoke-virtual {p1}, Lcom/digdroid/alman/dig/r1;->B()V

    return-void
.end method
