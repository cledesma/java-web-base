package web.java.base;

import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.notification.Notification;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;

@Route
public class MainView extends VerticalLayout {

	public MainView() {

		Button button = new Button("Click me", e -> {
			Notification.show("Clicked!");
		});
		add(button);

	}
}
