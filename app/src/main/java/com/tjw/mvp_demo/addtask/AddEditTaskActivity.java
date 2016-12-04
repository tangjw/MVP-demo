package com.tjw.mvp_demo.addtask;

import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.tjw.mvp_demo.R;
import com.tjw.mvp_demo.util.ActivityUtils;

public class AddEditTaskActivity extends AppCompatActivity implements 
        AddTaskFragment.OnFragmentInteractionListener {

    private AddTaskPresenter mAddTaskPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_edit_task);
        
        AddTaskFragment addTaskFragment =
                (AddTaskFragment) getSupportFragmentManager().findFragmentById(R.id.contentFrame);

        if (addTaskFragment == null) {
            addTaskFragment = AddTaskFragment.newInstance("我是标题", "我是内容");
        }

        ActivityUtils.addFragmentToActivity(getSupportFragmentManager(), 
                addTaskFragment, R.id.contentFrame);

        mAddTaskPresenter = new AddTaskPresenter(addTaskFragment);

        addTaskFragment.setPresenter(mAddTaskPresenter);
        
    }


    @Override
    public void onFragmentInteraction(Uri uri) {
        
    }
}
