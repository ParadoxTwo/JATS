package paradox.com.jats;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;

import de.hdodenhof.circleimageview.CircleImageView;

/**
 * Created by winbr on 7/20/2017.
 */

public class TasksAdapter extends RecyclerView.Adapter<TasksAdapter.ViewHolder> {
    private ArrayList<Task> taskArrayList = new ArrayList<>();
    Context context;

    public TasksAdapter(ArrayList<Task> taskArrayList) {
        this.taskArrayList = taskArrayList;
    }

    @Override
    public TasksAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        context = parent.getContext();
        LayoutInflater l = LayoutInflater.from(context);
        View v = l.inflate(R.layout.single_task_layout, parent,false);
        return new ViewHolder(v);    }

    @Override
    public void onBindViewHolder(TasksAdapter.ViewHolder holder, int position) {
        Task t = taskArrayList.get(position);
        //holder.image.setImageResource(context.getResources().getIdentifier(t.getImage(),"drawable",context.getPackageName()));
        holder.detail.setText(t.getDetail());
        holder.type.setText(t.getType());
        holder.time.setText(t.getTime());
    }

    @Override
    public int getItemCount() {
        return taskArrayList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        public ViewHolder(View itemView) {
            super(itemView);
            image = (CircleImageView) itemView.findViewById(R.id.image);
            type = (TextView) itemView.findViewById(R.id.type);
            detail = (TextView) itemView.findViewById(R.id.detail);
            time = (TextView)itemView.findViewById(R.id.time);
        }
        CircleImageView image;
        TextView type, detail, time;
    }
}
