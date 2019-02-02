package coursework.frames;


import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        final String text = "CourseWork";
       /* final CreateForm form = new CreateForm(text);
        form.setVisible(true);*/


        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                final CreateForm wnd = new CreateForm(text);
                wnd.setVisible(true);
            }
        });
    }
}

