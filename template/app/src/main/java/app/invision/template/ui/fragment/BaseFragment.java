package app.invision.template.ui.fragment;

import android.support.v4.app.Fragment;
import android.view.View;

/**
 * Created by Junaid-Invision on 5/10/2017.
 */
public abstract class BaseFragment extends Fragment {



    public abstract void setupComponents(View rootView);
    public abstract void setupListeners (View rootView);
}
