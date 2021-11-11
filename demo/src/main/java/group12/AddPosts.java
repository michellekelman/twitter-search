
import java.awt.event.ActionEvent;
        import java.awt.event.ActionListener;

        import javax.swing.JButton;
        import javax.swing.JFrame;
        import javax.swing.JLabel;
        import javax.swing.JPanel;
        import javax.swing.JTextField;

public class AddPosts extends JFrame
{
    JPanel jp = new JPanel();
    JLabel jl = new JLabel();
    JLabel jl2 = new JLabel();
    JTextField jt = new JTextField(30);
    JButton jb = new JButton("Add Post");

    public AddPosts()
    {
        setTitle("Make a new Tweet");
        setVisible(true);
        setSize(400, 200);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        jp.add(jt);


        jt.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                String input = jt.getText();
                jl.setText(input);
            }
        });

        jp.add(jb);
        jb.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                String input = jt.getText();
                jl2.setText("What is stored in the database: ");
                jl.setText(input);

            }
        });
        jp.add(jl2);
        jp.add(jl);
        add(jp);

    }

    public static void main(String[] args)
    {
        AddPosts t = new AddPosts();
    }
}