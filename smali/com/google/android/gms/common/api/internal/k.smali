.class final Lcom/google/android/gms/common/api/internal/k;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/google/android/gms/common/api/g$a;


# instance fields
.field private final synthetic a:Lcom/google/android/gms/common/api/internal/BasePendingResult;

.field private final synthetic b:Lcom/google/android/gms/common/api/internal/j;


# direct methods
.method constructor <init>(Lcom/google/android/gms/common/api/internal/j;Lcom/google/android/gms/common/api/internal/BasePendingResult;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/common/api/internal/k;->b:Lcom/google/android/gms/common/api/internal/j;

    iput-object p2, p0, Lcom/google/android/gms/common/api/internal/k;->a:Lcom/google/android/gms/common/api/internal/BasePendingResult;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lcom/google/android/gms/common/api/Status;)V
    .locals 1

    iget-object p1, p0, Lcom/google/android/gms/common/api/internal/k;->b:Lcom/google/android/gms/common/api/internal/j;

    invoke-static {p1}, Lcom/google/android/gms/common/api/internal/j;->a(Lcom/google/android/gms/common/api/internal/j;)Ljava/util/Map;

    move-result-object p1

    iget-object v0, p0, Lcom/google/android/gms/common/api/internal/k;->a:Lcom/google/android/gms/common/api/internal/BasePendingResult;

    invoke-interface {p1, v0}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method
