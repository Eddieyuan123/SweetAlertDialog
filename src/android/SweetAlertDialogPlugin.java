package cn.pedant.sweetalert;

import com.ionicframework.tradeweb716543.TradeApp;

import org.apache.cordova.CordovaPlugin;
import org.apache.cordova.CallbackContext;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/**
 * This class echoes a string called from JavaScript.
 */
public class SweetAlertDialogPlugin extends CordovaPlugin {

    @Override
    public boolean execute(String action, JSONArray args, CallbackContext callbackContext) throws JSONException {
        if (action.equals("createNomalDialog")) {
            String message = args.getString(0);
            this.createNomalDialog(message, callbackContext);
            return true;
        }
        return false;
    }

    private void createNomalDialog(String message, CallbackContext callbackContext) {
        if (message != null && message.length() > 0) {
            new SweetAlertDialog(TradeApp.getInstance().getActivity(),
                    SweetAlertDialog.NORMAL_TYPE)
                    .showCancelButton(true)
                    .setTitleText("sweet love")
                    .setContentText("sweet sweet love")
                    .show();

            callbackContext.success(message);
        } else {
            callbackContext.error("Expected one non-empty string argument.");
        }
    }
}
