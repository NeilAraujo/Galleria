package com.example.android.galleria.Models;

public class CollectionFolder {

    private String FolderName;
    private int NumPhotos;
    private int NumVideos;
    private int ImageId;

    public CollectionFolder(String mFolderName,int mNumPhotos,int mNumVideos,int mImageId){
        FolderName=mFolderName;
        NumPhotos=mNumPhotos;
        NumVideos=mNumVideos;
        ImageId=mImageId;
    }

    public String getFolderName() {
        return FolderName;
    }

    public int getImageId() {
        return ImageId;
    }

    public int getNumPhotos() {
        return NumPhotos;
    }

    public int getNumVideos() {
        return NumVideos;
    }

    public void setFolderName(String folderName) {
        FolderName = folderName;
    }

    public void setImageId(int imageId) {
        ImageId = imageId;
    }

    public void setNumPhotos(int numPhotos) {
        NumPhotos = numPhotos;
    }

    public void setNumVideos(int numVideos) {
        NumVideos = numVideos;
    }
}
