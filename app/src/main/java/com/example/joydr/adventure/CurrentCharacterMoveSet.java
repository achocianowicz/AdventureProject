package com.example.joydr.adventure;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 * Activities that contain this fragment must implement the
 * {@link CurrentCharacterMoveSet.OnFragmentInteractionListener} interface
 * to handle interaction events.
 * Use the {@link CurrentCharacterMoveSet#newInstance} factory method to
 * create an instance of this fragment.
 */
public class CurrentCharacterMoveSet extends Fragment {
    Button move1Button = null;
    TextView move1Text = null;
    Button move2Button = null;
    TextView move2Text = null;
    Button backButton = null;


    private OnFragmentInteractionListener mListener;

    public CurrentCharacterMoveSet() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment CurrentCharacterMoveSet.
     */
    // TODO: Rename and change types and number of parameters
    public static CurrentCharacterMoveSet newInstance(String param1, String param2) {
        CurrentCharacterMoveSet fragment = new CurrentCharacterMoveSet();
        Bundle args = new Bundle();
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {

        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        ViewGroup view = (ViewGroup) inflater.inflate(R.layout.fragment_current_character_move_set, container, false);
        move1Button = view.findViewById(R.id.move1Button);
        move1Text = view.findViewById(R.id.move1Text);
        move2Button = view.findViewById(R.id.move2Button);
        move2Text = view.findViewById(R.id.move2Text);
        backButton = view.findViewById(R.id.backButton);

        move1Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        move2Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });


        return inflater.inflate(R.layout.fragment_current_character_move_set, container, false);
    }

    // TODO: Rename method, update argument and hook method into UI event
    public void onButtonPressed(Uri uri) {
        if (mListener != null) {
            mListener.onFragmentInteraction(uri);
        }
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        if (context instanceof OnFragmentInteractionListener) {
            mListener = (OnFragmentInteractionListener) context;
        } else {
            throw new RuntimeException(context.toString()
                    + " must implement OnFragmentInteractionListener");
        }
    }

    @Override
    public void onDetach() {
        super.onDetach();
        mListener = null;

    }

    /**
     * This interface must be implemented by activities that contain this
     * fragment to allow an interaction in this fragment to be communicated
     * to the activity and potentially other fragments contained in that
     * activity.
     * <p>
     * See the Android Training lesson <a href=
     * "http://developer.android.com/training/basics/fragments/communicating.html"
     * >Communicating with Other Fragments</a> for more information.
     */
    public interface OnFragmentInteractionListener {
        // TODO: Update argument type and name
        void onFragmentInteraction(Uri uri);
    }
}
