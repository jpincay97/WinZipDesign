package com.example.winzipdesign;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.winzipdesign.Adapter.AdaptadorArchivo;
import com.example.winzipdesign.Model.Archivo;

import java.util.ArrayList;


/**
 * A simple {@link Fragment} subclass.
 * Activities that contain this fragment must implement the
 * to handle interaction events.
 * Use the {@link MyFiles#newInstance} factory method to
 * create an instance of this fragment.
 */
public class MyFiles extends Fragment {
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    ArrayList<Archivo> listaArchivos;
    RecyclerView rvArchivos;

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public MyFiles() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment MyFiles.
     */
    // TODO: Rename and change types and number of parameters
    public static MyFiles newInstance(String param1, String param2) {
        MyFiles fragment = new MyFiles();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        listaArchivos = new ArrayList<>();
        View view = inflater.inflate(R.layout.fragment_my_files,container,false);
        rvArchivos = (RecyclerView) view.findViewById(R.id.rvCorreos);
        rvArchivos.setLayoutManager(new LinearLayoutManager(getActivity()));
        llenarArchivos();

        AdaptadorArchivo adapter = new AdaptadorArchivo(listaArchivos);
        rvArchivos.setAdapter(adapter);

        return view;
    }

    public void llenarArchivos(){
        listaArchivos.add(new Archivo("Alarms","0 items 2017-12-31 19:00"));
        listaArchivos.add(new Archivo("Android","3 items 2020-02-05 19:24"));
        listaArchivos.add(new Archivo("aweme_monitor","0 items 2020-04-07 14:44"));
        listaArchivos.add(new Archivo("bytedance","2 items 2020-05-22 07:20"));
        listaArchivos.add(new Archivo("CamScanner","3 items 2020-03-27 21:07"));
        listaArchivos.add(new Archivo("com.facebook.katana","1 items 2019-02-07 05:46"));
        listaArchivos.add(new Archivo("com.facebook.orca","1 items 2019-02-25 21:06"));
        listaArchivos.add(new Archivo("DCIM","6 items 2019-02-23 11:43"));
        listaArchivos.add(new Archivo("Documents","0 items 2019-02-23 11:43"));
        listaArchivos.add(new Archivo("Download","94 items 2020-07-08 10:03"));
        listaArchivos.add(new Archivo("Emergency","1 items 2020-05-27 16:57"));
        listaArchivos.add(new Archivo("FaceApp","0 items 2020-06-23 11:30"));
    }

}
