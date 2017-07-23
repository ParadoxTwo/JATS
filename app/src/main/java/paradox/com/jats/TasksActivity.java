package paradox.com.jats;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

/**
 * Created by winbr on 7/12/2017.
 */

public class TasksActivity extends Fragment {
    private ArrayList<Task> taskArrayList = new ArrayList<>();
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.activity_tasks,container,false);
        if(taskArrayList.size()==0) {
            taskArrayList.add(new Task("Email", null, "to xyz", "Yesterday"));
            taskArrayList.add(new Task("Message", null, "to yzalpha", "2pm"));
        }
        RecyclerView taskList = (RecyclerView) v.findViewById(R.id.recyclerView);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(
                v.getContext()
        );
        taskList.setLayoutManager(layoutManager);
        TasksAdapter personAdapter = new TasksAdapter(taskArrayList);
        taskList.setAdapter(personAdapter);
        return v;
    }
}
