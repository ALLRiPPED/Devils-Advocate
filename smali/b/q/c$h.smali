.class Lb/q/c$h;
.super Landroid/animation/AnimatorListenerAdapter;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lb/q/c;->n(Landroid/view/ViewGroup;Lb/q/s;Lb/q/s;)Landroid/animation/Animator;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lb/q/c$k;

.field final synthetic b:Lb/q/c;

.field private mViewBounds:Lb/q/c$k;


# direct methods
.method constructor <init>(Lb/q/c;Lb/q/c$k;)V
    .locals 0

    iput-object p1, p0, Lb/q/c$h;->b:Lb/q/c;

    iput-object p2, p0, Lb/q/c$h;->a:Lb/q/c$k;

    invoke-direct {p0}, Landroid/animation/AnimatorListenerAdapter;-><init>()V

    iput-object p2, p0, Lb/q/c$h;->mViewBounds:Lb/q/c$k;

    return-void
.end method
