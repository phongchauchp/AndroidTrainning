package com.fstyle.androidtrainning.screen.main.mainfragments.mysong.subfragment.listsong;

/**
 * Created by Administrator on 12/10/17.
 */

public class ListSongPresenter implements ListSongContract.Presenter {

    private ListSongContract.Viewer mViewer;

    @Override
    public void setViewer(ListSongContract.Viewer viewer) {
        mViewer = viewer;
    }
}
