package com.iostream.holiday.fragment;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.iostream.holiday.R;
import com.iostream.holiday.home.ProductPaginationAdapter;
import com.iostream.holiday.utils.Utils;


public class HomeFragment extends Fragment {

    RecyclerView mProductRecycler;
    ProductPaginationAdapter mProductPagination;
    public HomeFragment() {
        // Required empty public constructor
    }


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_home, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        mProductRecycler=view.findViewById(R.id.productrecyclerview);
        LinearLayoutManager mLayoutManager = new LinearLayoutManager(getActivity());
        mProductRecycler.setLayoutManager(mLayoutManager);
        // notificationLayout.mNotiRecyclerView.addItemDecoration(new VerticalLineDecorator(2));
        mProductPagination=new ProductPaginationAdapter(getActivity());
         mProductRecycler.setAdapter(mProductPagination);
        mProductPagination.addAll(Utils.getProductList());
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);

    }

    @Override
    public void onDetach() {
        super.onDetach();

    }


}
