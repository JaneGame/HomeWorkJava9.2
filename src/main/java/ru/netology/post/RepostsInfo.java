package ru.netology.post;

public class RepostsInfo {
    private int count;
    private boolean userReposted;

    public int getCount() {
        return count;
    }

    public RepostsInfo setCount(int count) {
        this.count = count;
        return this;
    }

    public boolean getUserReposted() {
        return userReposted;
    }

    public RepostsInfo setUserReposted(boolean userReposted) {
        this.userReposted = userReposted;
        return this;
    }
}
