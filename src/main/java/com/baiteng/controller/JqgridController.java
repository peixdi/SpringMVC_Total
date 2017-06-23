package com.baiteng.controller;

import com.baiteng.entity.JSONData;
import com.baiteng.entity.JSONItem;
import com.google.gson.Gson;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Admin on 2017/6/22.
 */
@Controller
@RequestMapping(value ="/test")
public class JqgridController {
    @RequestMapping(value = "/jqgrid_array")
    public ModelAndView testJqgrid(){
        ModelAndView modelAndView = new ModelAndView("jqGrid/jqGrid");
        return modelAndView;
    }
    @RequestMapping(value = "/jqgrid_json")
    public void testJson(HttpServletResponse response, HttpServletRequest request)throws Exception{
        String rowlist = request.getParameter("rowlist");
        JSONData jd = new JSONData();
        jd.setPage(1);  //当期页 默认1
        jd.setRecords(13);
        jd.setTotal(2);
        List<JSONItem> jis = new ArrayList<JSONItem>();
        for(int i = 0;i < 13;i++){
            JSONItem ji = new JSONItem();
            ji.setId(i);
            ji.setName("name" + i);
            ji.setAmount("amount" + i);
            ji.setInvdate("333");
            ji.setNote("333");
            ji.setTax("333");
            ji.setTotal("333");
            jis.add(ji);
        }
        jd.setRows(jis);
        Gson gson = new Gson();


//        String jsondata = "{\"page\":\"1\"," +
//                "      \"total\":2," +
//                "      \"records\":\"13\"," +
//                "      \"rows\":" +
//                "          [" +
//                "            {" +
//                "              \"id\":\"13\"," +
//                "              \"cell\":" +
//                "                  [\"13\",\"2007-10-06\",\"Client 3\",\"1000.00\",\"0.00\",\"1000.00\",null]" +
//                "            }," +
//                "            {" +
//                "              \"id\":\"12\"," +
//                "              \"cell\":" +
//                "                  [\"12\",\"2007-10-06\",\"Client 2\",\"700.00\",\"140.00\",\"840.00\",null]" +
//                "            }," +
//                "            {" +
//                "              \"id\":\"11\"," +
//                "              \"cell\":" +
//                "                  [\"11\",\"2007-10-06\",\"Client 1\",\"600.00\",\"120.00\",\"720.00\",null]" +
//                "            }," +
//                "            {" +
//                "              \"id\":\"10\"," +
//                "              \"cell\":" +
//                "                  [\"10\",\"2007-10-06\",\"Client 2\",\"100.00\",\"20.00\",\"120.00\",null]" +
//                "            }," +
//                "            {" +
//                "              \"id\":\"9\"," +
//                "              \"cell\":" +
//                "                  [\"9\",\"2007-10-06\",\"Client 1\",\"200.00\",\"40.00\",\"240.00\",null]" +
//                "            }," +
//                "            {" +
//                "              \"id\":\"8\"," +
//                "              \"cell\":" +
//                "                  [\"8\",\"2007-10-06\",\"Client 3\",\"200.00\",\"0.00\",\"200.00\",null]" +
//                "            }," +
//                "            {" +
//                "              \"id\":\"7\"," +
//                "              \"cell\":" +
//                "                  [\"7\",\"2007-10-05\",\"Client 2\",\"120.00\",\"12.00\",\"134.00\",null]" +
//                "            }," +
//                "            {" +
//                "              \"id\":\"6\"," +
//                "              \"cell\":" +
//                "                  [\"6\",\"2007-10-05\",\"Client 1\",\"50.00\",\"10.00\",\"60.00\",\"\"]" +
//                "            }," +
//                "            {" +
//                "              \"id\":\"5\"," +
//                "              \"cell\":" +
//                "                  [\"5\",\"2007-10-05\",\"Client 3\",\"100.00\",\"0.00\",\"100.00\",\"no tax at all\"]" +
//                "            }," +
//                "            {" +
//                "              \"id\":\"4\"," +
//                "              \"cell\":" +
//                "                  [\"4\",\"2007-10-04\",\"Client 3\",\"150.00\",\"0.00\",\"150.00\",\"no tax\"]" +
//                "            }" +
//                "          ]," +
//                "      \"userdata\":{\"amount\":3220,\"tax\":342,\"total\":3564,\"name\":\"Totals:\"}" +
//                "    }";
        response.getWriter().write(gson.toJson(jd));
    }

}
