package learning.vinodsharma.com.smoothverticalviewpager;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;



public class FragMyFragment extends Fragment {

    String text;
    private static final String TEXT = "text";
    private TextView ivTextView;

    public FragMyFragment() {
        // Required empty public constructor
    }
  /*  public static FragMyFragment newInstance(String data) {
        FragMyFragment fragment = new FragMyFragment();
        Bundle bundle = new Bundle(1);
        bundle.putString(TEXT, data);
        fragment.setArguments(bundle);
        return fragment;
    }*/
    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
       // this.text = getArguments().getString(TEXT);
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_frag_my, container, false);
    //    ivTextView = view.findViewById(R.id.ivTextView);

        return view;
    }

}
