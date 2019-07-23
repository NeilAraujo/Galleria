package com.example.android.galleria.Utils;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.android.galleria.Models.CollectionFolder;
import com.example.android.galleria.R;

import java.util.List;

public class ColletionFolderAdapter extends ArrayAdapter<CollectionFolder> {

    private Context mcontext;

    private List<CollectionFolder> folders;

    public ColletionFolderAdapter(@NonNull Context context ,int resource, @NonNull List<CollectionFolder> objects) {
        super(context, resource , objects);
        mcontext=context;
        folders=objects;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View currentView=convertView;
        if(currentView==null){
            currentView=LayoutInflater.from(mcontext).inflate(R.layout.layout_collection_image,parent,false);
        }

        CollectionFolder folder=getItem(position);

        ImageView folderimage=currentView.findViewById(R.id.collection_folder_image);
        folderimage.setImageResource(folder.getImageId());

        TextView foldername=currentView.findViewById(R.id.collection_folder_name);
        foldername.setText(folder.getFolderName());

        TextView folderimages=currentView.findViewById(R.id.collection_folder_photos);
        folderimages.setText(folder.getNumPhotos());

        TextView foldervideos=currentView.findViewById(R.id.collection_folder_videos);
        foldervideos.setText(folder.getNumVideos());

        return currentView;
    }
}
