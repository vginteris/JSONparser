package parser;


import parser.models.*;
import parser.service.*;
import parser.service.impl.*;

import javax.swing.*;
import java.awt.*;
import java.io.IOException;
import java.util.List;

public class ProjectMain {
    private JFrame mainMap;
    private Polygon poly;

    public ProjectMain() throws IOException {
        drawApartamentPolygon();
    }

    private void drawApartamentPolygon() {
        IGraphicService graphicService = new GraphicServiceImp();
        Apartament apartament = graphicService.getApartament();

        ISeparateApartamentService apartamentService = new SeparateApartamentServiceImp();
        List<Floor> floorList = apartamentService.getAllFloor(apartament);
        for (int i = 0; i < floorList.size(); i++) {
            List<Room> roomList = apartamentService.getAllRoomsFromFloor(floorList.get(i));

            mainMap = new JFrame();
            mainMap.setResizable(false);
            mainMap.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

            JPanel panel = new JPanel() {
                @Override
                protected void paintComponent(Graphics graphics) {
                    super.paintComponent(graphics);
                    for (int i = 0; i < roomList.size(); i++) {
                        poly = graphicService.setCoordinateToPolygon(roomList.get(i));
                        graphics.setColor(Color.GRAY);
                        graphics.fillPolygon(poly);
                        graphics.setColor(Color.MAGENTA);
                        graphics.drawPolygon(poly);
                    }
                }

                @Override
                public Dimension getPreferredSize() {
                    return new Dimension(800, 800);
                }
            };
            mainMap.add(panel);
            mainMap.pack();
            mainMap.setVisible(true);
        }
    }


    public static void main(String[] args) {

        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                try {
                    new ProjectMain();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        });
    }
}
