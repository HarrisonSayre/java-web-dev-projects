package org.launchcode.skills_tracker.controllers;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@ResponseBody
public class SkillsController {
    @GetMapping("/")
    public String displayPage() {
        String html =
                "<html>" +
                        "<body>" +
                        "<h1>Skill Tracker</h1>" +
                        "<h2>We have a few skills we would like to learn. Here is the list</h2>" +
                        "<ol>" +
                        "<li>Java</li>" +
                        "<li>Javescript</li>" +
                        "<li>HTML</li>" +
                        "</ol>" +



                        "</body>" +
                        "</html>";
        return html;
    }

    @GetMapping("/form")
    public String displayForm(){
        return
                "<html>" +
                        "<body>" +
                "<form action ='/form' method='post'>" +
                        "<label>User Name </label>"+
                        "<input type='text' name='name'>" +
                        "<br/>"+


                        "<label> My favorite language <label>"+
                        "<br/>"+
                        "<select name='menu1'' id=menu1-select'>" +
                        "<option value='Java'>Java" +
                        "</option>" +
                        "<option value='Javascript'>Javascript" +
                        "</option>" +
                        "<option value='HTML'>HTML" +
                        "</option>" +
                        "</select>"+

                        "<br>"+
                        "<label> My second favorite language <label>"+
                        "<br/>"+
                        "<select name='menu2'' id=menu2-select'>" +
                        "<option value='Java'>Java" +
                        "</option>" +
                        "<option value='Javascript'>Javascript" +
                        "</option>" +
                        "<option value='HTML'>HTML" +
                        "</option>" +
                        "</select>"+

                        "<br>"+
                        "<label> My third favorite language <label>"+
                        "<br/>"+
                        "<select name='menu3'' id=menu3-select'>" +
                        "<option value='Java'>Java" +
                        "</option>" +
                        "<option value='Javascript'>Javascript" +
                        "</option>" +
                        "<option value='HTML'>HTML" +
                        "</option>" +
                        "</select>"+

                        "<br>"+
                        "<input type='submit' value='Submit!'>" +
                        "</form>"+
        "</body>" +
                "</html>";

    }
    @PostMapping("/form")
    public String filledForm(@RequestParam String name, String menu1, String menu2, String menu3){
        return  "<html>" +
                "<body>" +

                "<h1>"+name+"</h1>" +
//                "<ol>" +
//                "<li>"+menu1+"</li>" +
//                "<li>"+menu2+"</li>" +
//                "<li>"+menu3+"</li>" +
//                "</ol>"+

                "<table border=\"1\">\n" +
                "        <ol>\n" +
                "            <tr>\n" +
                "                <td>\n" +
                "                    <ol>\n" +
                "                        <li>"+menu1+"</li>\n" +
                "                </td>\n" +
                //"</ol>\n" + //Added
                "            </tr>\n" +
                "            <tr>\n" +
                "                <td>\n" +
                "                    <ol>\n" +
                "                        <li>"+menu2+"</li>\n" +
                "                </td>\n" +
                "        </ol>\n" +
                "        </tr>\n" +
                "        <tr>\n" +
                "            <td>\n" +
                "<ol>\n"+
                "                <li>"+menu3+"</li>\n" +
                "            </td>\n" +
                "</ol>"+
                "        </tr>\n" +
                "        </tr>\n" +
                "        </ol>\n" +
                "    </table>"+

                "</body>" +
                "</html>";
    }

}
