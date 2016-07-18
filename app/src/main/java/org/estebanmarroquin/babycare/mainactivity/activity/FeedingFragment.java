package org.estebanmarroquin.babycare.mainactivity.activity;

import android.app.Activity;
import android.content.Intent;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import org.estebanmarroquin.babycare.R;
import org.estebanmarroquin.babycare.activities.feeding.feeding.feed_10_month;
import org.estebanmarroquin.babycare.activities.feeding.feeding.feed_11_month;
import org.estebanmarroquin.babycare.activities.feeding.feeding.feed_12_month;
import org.estebanmarroquin.babycare.activities.feeding.feeding.feed_2_month;
import org.estebanmarroquin.babycare.activities.feeding.feeding.feed_1_month;
import org.estebanmarroquin.babycare.activities.feeding.feeding.feed_3_month;
import org.estebanmarroquin.babycare.activities.feeding.feeding.feed_4_month;
import org.estebanmarroquin.babycare.activities.feeding.feeding.feed_5_month;
import org.estebanmarroquin.babycare.activities.feeding.feeding.feed_6_month;
import org.estebanmarroquin.babycare.activities.feeding.feeding.feed_7_month;
import org.estebanmarroquin.babycare.activities.feeding.feeding.feed_8_month;
import org.estebanmarroquin.babycare.activities.feeding.feeding.feed_9_month;

/**
 * Created by pc on 13/07/2016.
 */
public class FeedingFragment extends Fragment{

    private static String[] meses = null;

    public FeedingFragment() {
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_feeding, container, false);

        String[] mesesComida = new String[] { "Primer mes al sexto", "Sexto mes", "Septimo mes", "Octavo mes", "Noveno mes", "Decimo mes", "Onceavo mes", "Doceavo mes"};

        //meses = getActivity().getResources().getStringArray(R.array.months);
        ArrayAdapter arrayAdapter = new ArrayAdapter(getActivity(),android.R.layout.simple_list_item_1, mesesComida);
        ListView feedList = (ListView) rootView.findViewById(R.id.feedingList);

        feedList.setAdapter(arrayAdapter);


        feedList.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                Intent primerMes = new Intent(getActivity(), feed_1_month.class);
                //Intent segundoMes = new Intent(getActivity(), feed_2_month.class);
                //Intent tercerMes = new Intent(getActivity(), feed_3_month.class);
                //Intent cuartoMes = new Intent(getActivity(), feed_4_month.class);
                //Intent quintoMes = new Intent(getActivity(), feed_5_month.class);
                Intent sextoMes = new Intent(getActivity(), feed_6_month.class);
                Intent septimoMes = new Intent(getActivity(), feed_7_month.class);
                Intent octavoMes = new Intent(getActivity(), feed_8_month.class);
                Intent novenoMes = new Intent(getActivity(), feed_9_month.class);
                Intent decimoMes = new Intent(getActivity(), feed_10_month.class);
                Intent onceavoMes = new Intent(getActivity(), feed_11_month.class);
                Intent doceavoMes = new Intent(getActivity(), feed_12_month.class);

                switch (position){
                    case 0:
                        startActivity(primerMes);
                        break;
                    /*case 1:
                        startActivity(segundoMes);
                        break;
                    case 2:
                        startActivity(tercerMes);
                        break;
                    case 3:
                        startActivity(cuartoMes);
                        break;
                    case 4:
                        startActivity(quintoMes);
                        break;*/
                    case 1:
                        startActivity(sextoMes);
                        break;
                    case 2:
                        startActivity(septimoMes);
                        break;
                    case 3:
                        startActivity(octavoMes);
                        break;
                    case 4:
                        startActivity(novenoMes);
                        break;
                    case 5:
                        startActivity(decimoMes);
                        break;
                    case 6:
                        startActivity(onceavoMes);
                        break;
                    case 7:
                        startActivity(doceavoMes);
                        break;
                }
            }
        });

        return rootView;
    }



    @Override
    public void onAttach(Activity activity) {
        super.onAttach(activity);
    }

    @Override
    public void onDetach() {
        super.onDetach();
    }

}