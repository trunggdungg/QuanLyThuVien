/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controler;

import java.util.List;
import javax.swing.JPanel;
import qltv.NgayMuonTra;
import service.ThongKeCon;
import service.ThongKeService;
import java.awt.CardLayout;
import java.awt.Dimension;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.axis.NumberAxis;
import org.jfree.chart.axis.NumberTickUnit;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;

/**
 *
 * @author ADMIN
 */
public class QuanLiThongKe {

    private ThongKeService thongKeService = null;

    public QuanLiThongKe() {
        this.thongKeService = new ThongKeCon();
    }

    public void setDataToChart1(JPanel jpnItem) {
        List<NgayMuonTra> listItem = thongKeService.getListByNgayMuon();

        DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        if (listItem != null) {
            for (NgayMuonTra item : listItem) {

                dataset.addValue(item.getSoLuong(), "Ngay muon", item.getNgayMuon());
                //  dataset.addValue(item.getNgayMuon(), "RowKey", "ColumnKey");
            }
            JFreeChart barChart = ChartFactory.createBarChart(
                    "Biểu đồ thống kê số lượng độc giả mượn sách trong ngày".toUpperCase(),
                    "Thời gian", "Số lượng",
                    dataset, PlotOrientation.VERTICAL, false, true, false);
            CategoryPlot plot = (CategoryPlot) barChart.getPlot();
            NumberAxis yAxis = new NumberAxis("Số lượng");
            yAxis.setRange(0, 10);
            plot.setRangeAxis(yAxis);
            ChartPanel chartPanel = new ChartPanel(barChart);
            chartPanel.setPreferredSize(new Dimension(jpnItem.getWidth(), 321));
            jpnItem.removeAll();
            jpnItem.setLayout(new CardLayout());
            jpnItem.add(chartPanel);
            jpnItem.validate();
            jpnItem.repaint();
        }
    }

}
