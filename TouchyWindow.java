import objectdraw.*;
import java.awt.*;

// add comment.

public class TouchyWindow extends WindowController {

    @Override public void onMousePress( Location point ) {
        new Text("�e�X�g", 40, 50, canvas );
    }

    @Override public void onMouseRelease( Location point ) {
        canvas.clear();
    }
}
