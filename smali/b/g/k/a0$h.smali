.class Lb/g/k/a0$h;
.super Lb/g/k/a0$g;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lb/g/k/a0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "h"
.end annotation


# instance fields
.field private e:Lb/g/d/b;

.field private f:Lb/g/d/b;

.field private g:Lb/g/d/b;


# direct methods
.method constructor <init>(Lb/g/k/a0;Landroid/view/WindowInsets;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lb/g/k/a0$g;-><init>(Lb/g/k/a0;Landroid/view/WindowInsets;)V

    const/4 p1, 0x0

    iput-object p1, p0, Lb/g/k/a0$h;->e:Lb/g/d/b;

    iput-object p1, p0, Lb/g/k/a0$h;->f:Lb/g/d/b;

    iput-object p1, p0, Lb/g/k/a0$h;->g:Lb/g/d/b;

    return-void
.end method

.method constructor <init>(Lb/g/k/a0;Lb/g/k/a0$h;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lb/g/k/a0$g;-><init>(Lb/g/k/a0;Lb/g/k/a0$g;)V

    const/4 p1, 0x0

    iput-object p1, p0, Lb/g/k/a0$h;->e:Lb/g/d/b;

    iput-object p1, p0, Lb/g/k/a0$h;->f:Lb/g/d/b;

    iput-object p1, p0, Lb/g/k/a0$h;->g:Lb/g/d/b;

    return-void
.end method


# virtual methods
.method e()Lb/g/d/b;
    .locals 1

    iget-object v0, p0, Lb/g/k/a0$h;->f:Lb/g/d/b;

    if-nez v0, :cond_0

    iget-object v0, p0, Lb/g/k/a0$e;->b:Landroid/view/WindowInsets;

    invoke-virtual {v0}, Landroid/view/WindowInsets;->getMandatorySystemGestureInsets()Landroid/graphics/Insets;

    move-result-object v0

    invoke-static {v0}, Lb/g/d/b;->b(Landroid/graphics/Insets;)Lb/g/d/b;

    move-result-object v0

    iput-object v0, p0, Lb/g/k/a0$h;->f:Lb/g/d/b;

    :cond_0
    iget-object v0, p0, Lb/g/k/a0$h;->f:Lb/g/d/b;

    return-object v0
.end method

.method h(IIII)Lb/g/k/a0;
    .locals 1

    iget-object v0, p0, Lb/g/k/a0$e;->b:Landroid/view/WindowInsets;

    invoke-virtual {v0, p1, p2, p3, p4}, Landroid/view/WindowInsets;->inset(IIII)Landroid/view/WindowInsets;

    move-result-object p1

    invoke-static {p1}, Lb/g/k/a0;->p(Landroid/view/WindowInsets;)Lb/g/k/a0;

    move-result-object p1

    return-object p1
.end method
