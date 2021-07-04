package com.qiyei.android.architecture.hilt;



import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import javax.inject.Inject;

import dagger.hilt.android.lifecycle.HiltViewModel;

@HiltViewModel
public class UserViewModel extends ViewModel {

    private Repository mRepository;

    private MutableLiveData<User> mUserMutableLiveData;

    @Inject
    public UserViewModel(Repository repository) {
        mRepository = repository;
        mUserMutableLiveData = new MutableLiveData<>();
    }

    public MutableLiveData<User> getUserMutableLiveData() {
        return mUserMutableLiveData;
    }

    public void getUser(){
        mUserMutableLiveData.postValue(mRepository.getUser());
    }
}
