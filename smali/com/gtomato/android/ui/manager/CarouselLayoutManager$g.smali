.class Lcom/gtomato/android/ui/manager/CarouselLayoutManager$g;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Landroid/os/Parcelable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/gtomato/android/ui/manager/CarouselLayoutManager;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "g"
.end annotation


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Lcom/gtomato/android/ui/manager/CarouselLayoutManager$g;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field b:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/gtomato/android/ui/manager/CarouselLayoutManager$g$a;

    invoke-direct {v0}, Lcom/gtomato/android/ui/manager/CarouselLayoutManager$g$a;-><init>()V

    sput-object v0, Lcom/gtomato/android/ui/manager/CarouselLayoutManager$g;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private constructor <init>(Landroid/os/Parcel;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result p1

    iput p1, p0, Lcom/gtomato/android/ui/manager/CarouselLayoutManager$g;->b:I

    return-void
.end method

.method synthetic constructor <init>(Landroid/os/Parcel;Lcom/gtomato/android/ui/manager/CarouselLayoutManager$a;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/gtomato/android/ui/manager/CarouselLayoutManager$g;-><init>(Landroid/os/Parcel;)V

    return-void
.end method


# virtual methods
.method public describeContents()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 0

    iget p2, p0, Lcom/gtomato/android/ui/manager/CarouselLayoutManager$g;->b:I

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    return-void
.end method
