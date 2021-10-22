package ru.netology.post;

public class Donut {
    private boolean isDonut;
    private int paidDuration;
    private boolean canPublishFreeCopy;
    private String editMode;

    public boolean isDonut() {
        return isDonut;
    }

    public Donut setDonut(boolean donut) {
        isDonut = donut;
        return this;
    }

    public int getPaidDuration() {
        return paidDuration;
    }

    public Donut setPaidDuration(int paidDuration) {
        this.paidDuration = paidDuration;
        return this;
    }

    public boolean isCanPublishFreeCopy() {
        return canPublishFreeCopy;
    }

    public Donut setCanPublishFreeCopy(boolean canPublishFreeCopy) {
        this.canPublishFreeCopy = canPublishFreeCopy;
        return this;
    }

    public String getEditMode() {
        return editMode;
    }

    public Donut setEditMode(String editMode) {
        this.editMode = editMode;
        return this;
    }
}
