package application;

public class Context {
	
	private String _view;
	private boolean _update = false;
	
	private final static Context instance = new Context();
	
	public static Context getInstance() {
		return instance;
	}
	
	public void setUpdate(boolean bool) {
		_update = bool;
	}
	
	public boolean isUpdate() {
		return _update;
	}
	
	public void setView(String view) {
		_view = view;
	}
	
	public String currentView() {
		return _view;
	}
	
}
