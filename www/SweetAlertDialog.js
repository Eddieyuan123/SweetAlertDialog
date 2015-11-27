var exec = require('cordova/exec');

var SweetAlertDialogPlugin = function(){
};

SweetAlertDialogPlugin.prototype.createNomalDialog = function(arg0, success, error) {
  return exec(success, error, "SweetAlertDialogPlugin", "createNomalDialog", [arg0]);
};

var sweetAlertDialogPlugin = new SweetAlertDialogPlugin();
module.exports = sweetAlertDialogPlugin;

if(!window.plugins){
  window.plugins = {};
}
if(!window.plugins.SweetAlertDialogPlugin){
  window.plugins.SweetAlertDialogPlugin = sweetAlertDialogPlugin;
}
