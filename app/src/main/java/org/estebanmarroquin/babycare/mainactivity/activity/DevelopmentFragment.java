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
import org.estebanmarroquin.babycare.activities.feeding.development.development_10_month;
import org.estebanmarroquin.babycare.activities.feeding.development.development_11_month;
import org.estebanmarroquin.babycare.activities.feeding.development.development_12_month;
import org.estebanmarroquin.babycare.activities.feeding.development.development_1_month;
import org.estebanmarroquin.babycare.activities.feeding.development.development_2_month;
import org.estebanmarroquin.babycare.activities.feeding.development.development_3_month;
import org.estebanmarroquin.babycare.activities.feeding.development.development_4_month;
import org.estebanmarroquin.babycare.activities.feeding.development.development_5_month;
import org.estebanmarroquin.babycare.activities.feeding.development.development_6_month;
import org.estebanmarroquin.babycare.activities.feeding.development.development_7_month;
import org.estebanmarroquin.babycare.activities.feeding.development.development_8_month;
import org.estebanmarroquin.babycare.activities.feeding.development.development_9_month;
import org.estebanmarroquin.babycare.activities.feeding.feeding.feed_1_month;
import org.estebanmarroquin.babycare.activities.feeding.feeding.feed_2_month;

/**
 * Created by pc on 13/07/2016.
 */
public class DevelopmentFragment extends Fragment{
    private static String[] meses = null;

    public DevelopmentFragment() {
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_development, container, false);

        meses = getActivity().getResources().getStringArray(R.array.months);
        ArrayAdapter arrayAdapter = new ArrayAdapter(getActivity(),android.R.layout.simple_list_item_1, meses);
        ListView developmentList = (ListView) rootView.findViewById(R.id.developmentList);

        developmentList.setAdapter(arrayAdapter);


        developmentList.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                Intent primerMes = new Intent(getActivity(), development_1_month.class);
                Intent segundoMes = new Intent(getActivity(), development_2_month.class);
                Intent tercerMes = new Intent(getActivity(), development_3_month.class);
                Intent cuartoMes = new Intent(getActivity(), development_4_month.class);
                Intent quintoMes = new Intent(getActivity(), development_5_month.class);
                Intent sextoMes = new Intent(getActivity(), development_6_month.class);
                Intent septimoMes = new Intent(getActivity(), development_7_month.class);
                Intent octavoMes = new Intent(getActivity(), development_8_month.class);
                Intent novenoMes = new Intent(getActivity(), development_9_month.class);
                Intent decimoMes = new Intent(getActivity(), development_10_month.class);
                Intent onceavoMes = new Intent(getActivity(), development_11_month.class);
                Intent doceavoMes = new Intent(getActivity(), development_12_month.class);

                switch (position){
                    case 0:
                        startActivity(primerMes);
                        break;
                    case 1:
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
                        break;
                    case 5:
                        startActivity(sextoMes);
                        break;
                    case 6:
                        startActivity(septimoMes);
                        break;
                    case 7:
                        startActivity(octavoMes);
                        break;
                    case 8:
                        startActivity(novenoMes);
                        break;
                    case 9:
                        startActivity(decimoMes);
                        break;
                    case 10:
                        startActivity(onceavoMes);
                        break;
                    case 11:
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