package ru.yandex.practicum.contacts.presentation.sort;

class SortUiState {

    private boolean isApplyEnable = false;
    private String newSelectedSortType = null;

    public boolean isApplyEnable() {
        return isApplyEnable;
    }
    public void setApplyEnable(boolean applyEnable) {
        isApplyEnable = applyEnable;
    }
    public String getNewSelectedSortType() {
        return newSelectedSortType;
    }
    public void setNewSelectedSortType(String newSelectedSortType) {
        this.newSelectedSortType = newSelectedSortType;
    }

}
