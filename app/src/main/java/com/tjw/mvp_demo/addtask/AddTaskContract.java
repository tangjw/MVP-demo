package com.tjw.mvp_demo.addtask;

import com.tjw.mvp_demo.BasePresenter;
import com.tjw.mvp_demo.BaseView;

/**
 * ^-^ Created by tang-jw on 12/4.
 */

public interface AddTaskContract {

    interface View extends BaseView<Presenter> {

        void showEmptyTaskError();

        void showTasksList();

        void setTitle(String title);

        void setDescription(String description);

        boolean isActive();
        
    }
    
    

    interface Presenter extends BasePresenter {
        
        void saveTask(String title, String description);

        void populateTask();

        boolean isDataMissing();
        
    }
    
    
}
