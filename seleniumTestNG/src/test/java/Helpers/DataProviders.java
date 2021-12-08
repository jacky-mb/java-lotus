package Helpers;

import io.cucumber.java.it.Ma;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.Assert;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Struct;
import java.util.*;

public class DataProviders {
    public DataProviders() {
        super();
    }

    public static List<HashMap<String, Object>> parseExcel(String pathFile, String sheetName) throws IOException {
        File myFile = new File(pathFile);
        FileInputStream fis = new FileInputStream(myFile);
        List<HashMap<String, Object>> result = new ArrayList<>();
        XSSFWorkbook myWorkBook = new XSSFWorkbook(fis);
        /*Get index sheet by shee name */
        int numberSheet = myWorkBook.getNumberOfSheets();
        int indexSheet = 0;
        boolean flag = false;
        for (int i = 0; i < numberSheet; i++) {
            if (sheetName.equals(myWorkBook.getSheetName(i))) {
                flag = true;
                indexSheet = i;
            }
        }
        Assert.assertTrue(flag, "Sheet not found!");
        XSSFSheet mySheet = myWorkBook.getSheetAt(indexSheet);
        FormulaEvaluator evaluator = myWorkBook.getCreationHelper().createFormulaEvaluator();
        DataFormatter df = new DataFormatter();
        Iterator<Row> rowIterator = mySheet.iterator();
        int countRow = 0;
        List<String> header = new ArrayList<>();

        while (rowIterator.hasNext()) {
            Row row = rowIterator.next();
            Iterator<Cell> cellIterator = row.cellIterator();
            HashMap<String, Object> map = new HashMap<>();
            if (countRow == 0) {
                while (cellIterator.hasNext()) {
                    Cell cell = cellIterator.next();
                    header.add(cell.getStringCellValue().trim());
                }
            } else {
                for (int i = 0; i < header.size(); i++) {
                    Cell c = row.getCell(i);
                    String cellValue = df.formatCellValue(c, evaluator);
                    map.put((header.get(i)), cellValue);
                }
                result.add(map);
            }
            countRow++;
        }
        return result;
    }

    public static List<Map<String, Object>> filters(List<HashMap<String, Object>> data, Map<String, Object> filter){
        List<Map<String, Object>> output = new ArrayList<>();

        for (Map.Entry<String, Object> entry : filter.entrySet()) {
            for (int i = 0; i < data.size(); i++) {
                if (data.get(i).get(entry.getKey()).equals(String.valueOf(entry.getValue()))) {
                    output.add(data.get(i));
                }
            }
        }
        return output;
    }


    public static void main(String[] args) throws IOException {

//        String file = "src/test/resources/_data/demo.xlsx";
//        String sheetName = "loginncc";
//        List<HashMap<String, Object>> list = parseExcel(file, sheetName);
//        Map<String, Object> filter = new HashMap<String, Object>() {{
//            put("index", 1);
//        }};
//        List<Map<String, Object>> lists = filters(list, filter);
//        System.out.println(lists);


    }

}
