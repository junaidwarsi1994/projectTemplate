package app.invision.template.listeners;

import java.util.ArrayList;

/**
 * Created by Lenovo on 4/20/2017.
 */

public interface ObjectListener <T> {

    public void success(T obj);
    public void success(ArrayList<T> obj);
    public void error(Error e, String errorMsg);
}
