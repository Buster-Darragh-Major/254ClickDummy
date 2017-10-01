package application;

public class Context {
	
	private String _view;
	
	private final static Context instance = new Context();
	
	public static Context getInstance() {
		return instance;
	}
	
	public void setView(String view) {
		_view = view;
	}
	
	public String currentView() {
		return _view;
	}
	
}
