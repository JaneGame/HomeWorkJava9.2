package ru.netology.post;

public class LikesInfo {
    private int count;
    private boolean userLike;
    private boolean canLike;
    private boolean canPiblish;

    public int getCount() {
        return count;
    }

    public LikesInfo setCount(int count) {
        this.count = count;
        return this;
    }

    public boolean getUserLike() {
        return userLike;
    }

    public LikesInfo setUserLike(boolean userLike) {
        this.userLike = userLike;
        return this;
    }

    public boolean getCanLike() {
        return canLike;
    }

    public LikesInfo setCanLike(boolean canLike) {
        this.canLike = canLike;
        return this;
    }

    public boolean getCanPiblish() {
        return canPiblish;
    }

    public LikesInfo setCanPiblish(boolean canPiblish) {
        this.canPiblish = canPiblish;
        return this;
    }
}
