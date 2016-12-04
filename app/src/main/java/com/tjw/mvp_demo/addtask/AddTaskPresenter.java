package com.tjw.mvp_demo.addtask;

import android.support.annotation.NonNull;

import com.tjw.mvp_demo.util.SPUtils;

/**
 * ^-^ Created by tang-jw on 12/4.
 */

public class AddTaskPresenter implements AddTaskContract.Presenter {


    @NonNull
    private final AddTaskContract.View mAddTaskView;

    public AddTaskPresenter(@NonNull AddTaskContract.View addTaskView) {
        mAddTaskView = addTaskView;
    }

    @Override
    public void saveTask(String title, String description) {
        SPUtils.setString("title", title);
        SPUtils.setString("description", description);
    }

    @Override
    public void populateTask() {
        if (mAddTaskView.isActive()) {
            mAddTaskView.setTitle(SPUtils.getString("title", null));
            mAddTaskView.setDescription(SPUtils.getString("description", null));
            mAddTaskView.showTasksList();
        }
    }

    @Override
    public boolean isDataMissing() {
        return false;
    }

    @Override
    public void start() {
        // TODO: 12/4 判断条件 
        populateTask();
    }
}
