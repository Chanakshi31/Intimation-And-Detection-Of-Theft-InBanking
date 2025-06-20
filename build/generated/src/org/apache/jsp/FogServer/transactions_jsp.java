package org.apache.jsp.FogServer;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;
import javax.naming.*;
import java.*;
import java.lang.*;
import java.util.*;
import java.text.*;
import DAL.*;

public final class transactions_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(1);
    _jspx_dependants.add("/WEB-INF/datagrid.tld");
  }

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_grd_gridsorter_sortColumn_sortAscending_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_grd_dbgrid_width_totalRecords_pageSize_name_id_dataSource_dataMember_currentPage_cssClass_cellSpacing_cellPadding_border;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_grd_gridpager_imgPrevious_imgNext_imgLast_imgFirst_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_grd_textcolumn_width_headerText_dataFormat_dataField_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_grd_textcolumn_width_headerText_dataField_nobody;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_grd_gridsorter_sortColumn_sortAscending_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_grd_dbgrid_width_totalRecords_pageSize_name_id_dataSource_dataMember_currentPage_cssClass_cellSpacing_cellPadding_border = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_grd_gridpager_imgPrevious_imgNext_imgLast_imgFirst_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_grd_textcolumn_width_headerText_dataFormat_dataField_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_grd_textcolumn_width_headerText_dataField_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_grd_gridsorter_sortColumn_sortAscending_nobody.release();
    _jspx_tagPool_grd_dbgrid_width_totalRecords_pageSize_name_id_dataSource_dataMember_currentPage_cssClass_cellSpacing_cellPadding_border.release();
    _jspx_tagPool_grd_gridpager_imgPrevious_imgNext_imgLast_imgFirst_nobody.release();
    _jspx_tagPool_grd_textcolumn_width_headerText_dataFormat_dataField_nobody.release();
    _jspx_tagPool_grd_textcolumn_width_headerText_dataField_nobody.release();
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
 // String user=request.getParameter("user");
    // Username.user=user;

      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html xmlns=\"http://www.w3.org/1999/xhtml\">\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\" />\n");
      out.write("        <title>FogComputing</title>\n");
      out.write("        <meta name=\"keywords\" content=\"wooden strip, portfolio, theme, free templates, website templates, CSS, XHTML\" />\n");
      out.write("        <meta name=\"description\" content=\"Wooden Strip Portfolio - free website theme (xhtml/css) provided by templatemo.com\" />\n");
      out.write("        <link href=\"templatemo_style.css\" rel=\"stylesheet\" type=\"text/css\" />\n");
      out.write("        <link rel=\"StyleSheet\" href=\"GridStyle.css\"/>\n");
      out.write("        <!--////// CHOOSE ONE OF THE 3 PIROBOX STYLES  \\\\\\\\\\\\\\-->\n");
      out.write("        <link href=\"css_pirobox/white/style.css\" media=\"screen\" title=\"shadow\" rel=\"stylesheet\" type=\"text/css\" />\n");
      out.write("        <!--<link href=\"css_pirobox/white/style.css\" media=\"screen\" title=\"white\" rel=\"stylesheet\" type=\"text/css\" />\n");
      out.write("        <link href=\"css_pirobox/black/style.css\" media=\"screen\" title=\"black\" rel=\"stylesheet\" type=\"text/css\" />-->\n");
      out.write("        <!--////// END  \\\\\\\\\\\\\\-->\n");
      out.write("\n");
      out.write("        <!--////// INCLUDE THE JS AND PIROBOX OPTION IN YOUR HEADER  \\\\\\\\\\\\\\-->\n");
      out.write("        <script type=\"text/javascript\" src=\"js/jquery.min.js\"></script>\n");
      out.write("        <script type=\"text/javascript\" src=\"js/piroBox.1_2.js\"></script>\n");
      out.write("        <script type=\"text/javascript\">\n");
      out.write("            $(document).ready(function() {\n");
      out.write("                $().piroBox({\n");
      out.write("                    my_speed: 600, //animation speed\n");
      out.write("                    bg_alpha: 0.5, //background opacity\n");
      out.write("                    radius: 4, //caption rounded corner\n");
      out.write("                    scrollImage: false, // true == image follows the page, false == image remains in the same open position\n");
      out.write("                    pirobox_next: 'piro_next', // Nav buttons -> piro_next == inside piroBox , piro_next_out == outside piroBox\n");
      out.write("                    pirobox_prev: 'piro_prev', // Nav buttons -> piro_prev == inside piroBox , piro_prev_out == outside piroBox\n");
      out.write("                    close_all: '.piro_close', // add class .piro_overlay(with comma)if you want overlay click close piroBox\n");
      out.write("                    slideShow: 'slideshow', // just delete slideshow between '' if you don't want it.\n");
      out.write("                    slideSpeed: 4 //slideshow duration in seconds(3 to 6 Recommended)\n");
      out.write("                });\n");
      out.write("            });\n");
      out.write("        </script>\n");
      out.write("        <!--////// END  \\\\\\\\\\\\\\-->\n");
      out.write("\n");
      out.write("        <script language=\"javascript\">\n");
      out.write("\n");
      out.write("            function doNavigate(pstrWhere, pintTot)\n");
      out.write("            {\n");
      out.write("                var strTmp;\n");
      out.write("                var intPg;\n");
      out.write("\n");
      out.write("                strTmp = document.frmMain.txtCurr.value;\n");
      out.write("                intPg = parseInt(strTmp);\n");
      out.write("                if (isNaN(intPg))\n");
      out.write("                    intPg = 1;\n");
      out.write("\n");
      out.write("                if ((pstrWhere == 'F' || pstrWhere == 'P') && intPg == 1)\n");
      out.write("                {\n");
      out.write("                    alert(\"You are already viewing first page!\");\n");
      out.write("                    return;\n");
      out.write("                }\n");
      out.write("                else if ((pstrWhere == 'N' || pstrWhere == 'L') && intPg == pintTot)\n");
      out.write("                {\n");
      out.write("                    alert(\"You are already viewing last page!\");\n");
      out.write("                    return;\n");
      out.write("                }\n");
      out.write("\n");
      out.write("                if (pstrWhere == 'F')\n");
      out.write("                    intPg = 1;\n");
      out.write("                else if (pstrWhere == 'P')\n");
      out.write("                    intPg = intPg - 1;\n");
      out.write("                else if (pstrWhere == 'N')\n");
      out.write("                    intPg = intPg + 1;\n");
      out.write("                else if (pstrWhere == 'L')\n");
      out.write("                    intPg = pintTot;\n");
      out.write("\n");
      out.write("                if (intPg < 1)\n");
      out.write("                    intPg = 1;\n");
      out.write("                if (intPg > pintTot)\n");
      out.write("                    intPg = pintTot;\n");
      out.write("                document.frmMain.txtCurr.value = intPg;\n");
      out.write("                document.frmMain.submit();\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            function doSort(pstrFld, pstrOrd)\n");
      out.write("            {\n");
      out.write("                document.frmMain.txtSortCol.value = pstrFld;\n");
      out.write("                document.frmMain.txtSortAsc.value = pstrOrd;\n");
      out.write("                document.frmMain.submit();\n");
      out.write("            }\n");
      out.write("\n");
      out.write("        </script>\n");
      out.write("\n");
      out.write("\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("\n");
      out.write("        ");

            MyAdo ma = new MyAdo();
            ma.Visit(session.getAttribute("sid").toString(), ma.getOldLinks(session.getAttribute("sid").toString()) + "," + request.getRequestURL().toString());
        
      out.write("\n");
      out.write("        <table border=\"0\" align=\"right\">\n");
      out.write("            <tbody>\n");
      out.write("                <tr>\n");
      out.write("                    <td><div class=\"button\"><strong>Welcome ");
      out.print(session.getAttribute("sid").toString());
      out.write("   </strong><a href=\" logout.jsp\">Logout</a>\n");
      out.write("                        </div> </td>\n");
      out.write("                </tr>\n");
      out.write("            </tbody>\n");
      out.write("        </table>\n");
      out.write("\n");
      out.write("        <div id=\"templatemo_header_wrapper\">\n");
      out.write("            <div id=\"templatemo_header\">\n");
      out.write("\n");
      out.write("                <div id=\"header_left\">\n");
      out.write("\n");
      out.write("                    <div id=\"site_title\">\n");
      out.write("\n");
      out.write("                        <a href=\"#\"><img src=\"images/cooltext867626108.png\" alt=\"logo\" />State Bank of India</a>\n");
      out.write("\n");
      out.write("                    </div> <!-- end of site_title -->\n");
      out.write("\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                <div class=\"cleaner\"></div>\n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        <div id=\"templatemo_top_wrapper\">\n");
      out.write("            <div id=\"templatemo_top\">\n");
      out.write("\n");
      out.write("                <h2></h2>\n");
      out.write("                <p>Transaction Account </p>\n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        <div id=\"templatemo_middle_wrapper1\">\n");
      out.write("\n");
      out.write("            <div id=\"content_wrapper1\">\n");
      out.write("\n");
      out.write("                <div class=\"content_box_top1\"></div>\n");
      out.write("                <div class=\"content_box1\">\n");
      out.write("\n");
      out.write("\n");
      out.write("                    <div id=\"gallery\">\n");
      out.write("                    </div>\n");
      out.write("                    <ul>\n");
      out.write("                        <li><a href=\"bal.jsp\">View Balance</a></li>\n");
      out.write("                        <li><a href=\"withdrawal.jsp\">Withdrawal</a></li>\n");
      out.write("                        <li><a href=\"deposit.jsp\">Deposit</a></li>\n");
      out.write("                        <li><a href=\"userpage.jsp\">Home</a></li>\n");
      out.write("                    </ul>                \n");
      out.write("                    ");

                        String loginname = session.getAttribute("sid").toString();
                        MyAdo md = new MyAdo();
                        ResultSet rs = md.balid(loginname);
                        String bal = "", id = "";
                        try {
                            while (rs.next()) {
                                id = rs.getString("id");
                                bal = rs.getString("bal");
                            }
                    
      out.write("\n");
      out.write("                    <center>\n");
      out.write("                        <strong><font size=\"5\">");
      out.print(session.getAttribute("sid").toString());
      out.write(" Last Some Transactions</font><br>\n");
      out.write("\n");
      out.write("                        </strong>\n");
      out.write("                    </center>\n");
      out.write("                    ");


                        } catch (SQLException sql) {
                            sql.printStackTrace();
                            out.println("Error Error Error Error Error Error Error Error Error");
                        }
                    
      out.write("\n");
      out.write("\n");
      out.write("                    <table   border=\"0\" cellpadding=\"0\" cellspacing=\"0\" >\n");
      out.write("\n");
      out.write("                        ");

                            // String user1=Username.user;
                            //  session.setAttribute("user",user1);
                            String ok = session.getAttribute("sid").toString();
                            int intCurr = 1;
                            int intSortOrd = 0;
                            int totRec = 0;
                            String strTmp = null;
                            String strSQL = null;
                            String strSortCol = null;
                            String strCountSQL = null;
                            String strSortOrd = "DESC";
                            boolean blnSortAsc = true;

                            Connection objCnn = null;
                            Class objDrvCls = null;
                            Context ctx = null;
                            Statement stmt = null;
                            //ResultSet rs = null;

                            strSQL = "SELECT * FROM transection where id='" + id + "'";
                            strCountSQL = "SELECT COUNT(1) FROM transection where id='" + id + "'";

                            ctx = new InitialContext();
//                           Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
//                            objCnn = DriverManager.getConnection("Jdbc:odbc:fogcomputing");

                            Class.forName("com.mysql.jdbc.Driver");
                            objCnn = DriverManager.getConnection("jdbc:mysql://localhost:3306/fogcomputing", "root", "root");

                            stmt = objCnn.createStatement();
                            rs = stmt.executeQuery(strCountSQL);
                            if (rs != null && rs.next()) {
                                totRec = rs.getInt(1);
                                rs.close();
                                rs = null;
                                stmt.close();
                                stmt = null;
                            }

                            strTmp = request.getParameter("txtCurr");
                            try {
                                if (strTmp != null) {
                                    intCurr = Integer.parseInt(strTmp);
                                }
                            } catch (NumberFormatException NFEx) {
                            }
                            strSortCol = request.getParameter("txtSortCol");
                            strSortOrd = request.getParameter("txtSortAsc");
                            if (strSortCol == null) {
                                strSortCol = "usertransection";
                            }
                            if (strSortOrd == null) {
                                strSortOrd = "DESC";
                            }
                            blnSortAsc = (strSortOrd.equals("DESC"));

                            stmt = objCnn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
                            rs = stmt.executeQuery(strSQL + " ORDER BY " + strSortCol + " " + strSortOrd);
                        
      out.write("\n");
      out.write("                        <form NAME=\"frmMain\" METHOD=\"post\">\n");
      out.write("                            <strong> Your Total Transection : ");
      out.print(totRec);
      out.write("</strong><br>\n");
      out.write("                                ");
      //  grd:dbgrid
      com.freeware.gridtag.DBGrid _jspx_th_grd_dbgrid_0 = (com.freeware.gridtag.DBGrid) _jspx_tagPool_grd_dbgrid_width_totalRecords_pageSize_name_id_dataSource_dataMember_currentPage_cssClass_cellSpacing_cellPadding_border.get(com.freeware.gridtag.DBGrid.class);
      _jspx_th_grd_dbgrid_0.setPageContext(_jspx_page_context);
      _jspx_th_grd_dbgrid_0.setParent(null);
      _jspx_th_grd_dbgrid_0.setId("tblStat");
      _jspx_th_grd_dbgrid_0.setName("tblStat");
      _jspx_th_grd_dbgrid_0.setWidth(100);
      _jspx_th_grd_dbgrid_0.setPageSize(5);
      _jspx_th_grd_dbgrid_0.setCurrentPage(intCurr);
      _jspx_th_grd_dbgrid_0.setBorder(0);
      _jspx_th_grd_dbgrid_0.setCellSpacing(1);
      _jspx_th_grd_dbgrid_0.setCellPadding(2);
      _jspx_th_grd_dbgrid_0.setDataMember(strSQL);
      _jspx_th_grd_dbgrid_0.setDataSource(rs);
      _jspx_th_grd_dbgrid_0.setCssClass("gridTable");
      _jspx_th_grd_dbgrid_0.setTotalRecords(totRec);
      int _jspx_eval_grd_dbgrid_0 = _jspx_th_grd_dbgrid_0.doStartTag();
      if (_jspx_eval_grd_dbgrid_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        if (_jspx_eval_grd_dbgrid_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
          out = _jspx_page_context.pushBody();
          _jspx_th_grd_dbgrid_0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
          _jspx_th_grd_dbgrid_0.doInitBody();
        }
        do {
          out.write("\n");
          out.write("                                    ");
          if (_jspx_meth_grd_gridpager_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_grd_dbgrid_0, _jspx_page_context))
            return;
          out.write("\n");
          out.write("                                    ");
          //  grd:gridsorter
          com.freeware.gridtag.GridSorter _jspx_th_grd_gridsorter_0 = (com.freeware.gridtag.GridSorter) _jspx_tagPool_grd_gridsorter_sortColumn_sortAscending_nobody.get(com.freeware.gridtag.GridSorter.class);
          _jspx_th_grd_gridsorter_0.setPageContext(_jspx_page_context);
          _jspx_th_grd_gridsorter_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_grd_dbgrid_0);
          _jspx_th_grd_gridsorter_0.setSortColumn(strSortCol);
          _jspx_th_grd_gridsorter_0.setSortAscending(blnSortAsc);
          int _jspx_eval_grd_gridsorter_0 = _jspx_th_grd_gridsorter_0.doStartTag();
          if (_jspx_th_grd_gridsorter_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _jspx_tagPool_grd_gridsorter_sortColumn_sortAscending_nobody.reuse(_jspx_th_grd_gridsorter_0);
            return;
          }
          _jspx_tagPool_grd_gridsorter_sortColumn_sortAscending_nobody.reuse(_jspx_th_grd_gridsorter_0);
          out.write("\n");
          out.write("\n");
          out.write("                                    ");
          if (_jspx_meth_grd_textcolumn_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_grd_dbgrid_0, _jspx_page_context))
            return;
          out.write("\n");
          out.write("                                    ");
          if (_jspx_meth_grd_textcolumn_1((javax.servlet.jsp.tagext.JspTag) _jspx_th_grd_dbgrid_0, _jspx_page_context))
            return;
          out.write("\n");
          out.write("                                    ");
          if (_jspx_meth_grd_textcolumn_2((javax.servlet.jsp.tagext.JspTag) _jspx_th_grd_dbgrid_0, _jspx_page_context))
            return;
          out.write("\n");
          out.write("                                    ");
          if (_jspx_meth_grd_textcolumn_3((javax.servlet.jsp.tagext.JspTag) _jspx_th_grd_dbgrid_0, _jspx_page_context))
            return;
          out.write("\n");
          out.write("                                    ");
          if (_jspx_meth_grd_textcolumn_4((javax.servlet.jsp.tagext.JspTag) _jspx_th_grd_dbgrid_0, _jspx_page_context))
            return;
          out.write("\n");
          out.write("                                    ");
          if (_jspx_meth_grd_textcolumn_5((javax.servlet.jsp.tagext.JspTag) _jspx_th_grd_dbgrid_0, _jspx_page_context))
            return;
          out.write("\n");
          out.write("                                ");
          int evalDoAfterBody = _jspx_th_grd_dbgrid_0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
        if (_jspx_eval_grd_dbgrid_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
          out = _jspx_page_context.popBody();
      }
      if (_jspx_th_grd_dbgrid_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _jspx_tagPool_grd_dbgrid_width_totalRecords_pageSize_name_id_dataSource_dataMember_currentPage_cssClass_cellSpacing_cellPadding_border.reuse(_jspx_th_grd_dbgrid_0);
        return;
      }
      _jspx_tagPool_grd_dbgrid_width_totalRecords_pageSize_name_id_dataSource_dataMember_currentPage_cssClass_cellSpacing_cellPadding_border.reuse(_jspx_th_grd_dbgrid_0);
      out.write("\n");
      out.write("                                <input TYPE=\"hidden\" NAME=\"txtCurr\" VALUE=\"");
      out.print(intCurr);
      out.write("\">\n");
      out.write("                                    <input TYPE=\"hidden\" NAME=\"txtSortCol\" VALUE=\"");
      out.print(strSortCol);
      out.write("\">\n");
      out.write("                                        <input TYPE=\"hidden\" NAME=\"txtSortAsc\" VALUE=\"");
      out.print(strSortOrd);
      out.write("\">\n");
      out.write("                                            </form>\n");
      out.write("                                            </table> \n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                                        </div><div class=\"content_box_bottom1\"></div>\n");
      out.write("\n");
      out.write("                                    </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("                                    </div>\n");
      out.write("\n");
      out.write("                                    <!--                                    <div id=\"templatemo_footer_wrapper\">\n");
      out.write("                                    \n");
      out.write("                                                                            <div id=\"templatemo_footer\">\n");
      out.write("                                    \n");
      out.write("                                                                                <div class=\"col_w270\">\n");
      out.write("                                                                                    <h4>Follow Us</h4>\n");
      out.write("                                                                                    <p>Cras a volutpat lacus. Ut nisi metus, lobortis vel egestas at, condimentum.</p>\n");
      out.write("                                    \n");
      out.write("                                                                                    <ul id=\"social_box\">\n");
      out.write("                                                                                        <li><a href=\"http://www.facebook.com/templatemo\"><img src=\"images/facebook.png\" alt=\"facebook\" /></a></li>\n");
      out.write("                                                                                        <li><a href=\"http://www.facebook.com/templatemo\"><img src=\"images/twitter.png\" alt=\"twitter\" /></a></li>\n");
      out.write("                                                                                        <li><a href=\"#\"><img src=\"images/linkedin.png\" alt=\"linkin\" /></a></li>\n");
      out.write("                                                                                        <li><a href=\"#\"><img src=\"images/technorati.png\" alt=\"technorati\" /></a></li>\n");
      out.write("                                                                                        <li><a href=\"#\"><img src=\"images/myspace.png\" alt=\"myspace\" /></a></li>                \n");
      out.write("                                                                                    </ul>\n");
      out.write("                                                                                </div>\n");
      out.write("                                    \n");
      out.write("                                                                                <div class=\"col_w270\">\n");
      out.write("                                                                                    <h4>Our Pages</h4>\n");
      out.write("                                                                                    <ul>\n");
      out.write("                                                                                        <li><a href=\"index.jsp\">Home</a></li>\n");
      out.write("                                                                                        <li><a href=\"portfolio.html\">Portfolio</a></li>\n");
      out.write("                                                                                        <li><a href=\"services.html\">Services</a></li>\n");
      out.write("                                                                                        <li><a href=\"Registrationform.jsp\">Blog Post</a></li>\n");
      out.write("                                                                                        <li><a href=\"contact.html\" class=\"last\">Contact</a></li>\n");
      out.write("                                                                                    </ul>  \n");
      out.write("                                                                                </div>\n");
      out.write("                                    \n");
      out.write("                                                                                <div class=\"col_w270 col_w270_last\">\n");
      out.write("                                                                                    <h4>Partners</h4>\n");
      out.write("                                                                                    <ul>\n");
      out.write("                                                                                        <li><a href=\"http://www.flashmo.com\">Flash Templates</a></li>\n");
      out.write("                                                                                        <li><a href=\"http://www.templatemo.com\">Free CSS Templates</a></li>\n");
      out.write("                                                                                        <li><a href=\"http://www.koflash.com\">Flash Websites</a></li>\n");
      out.write("                                                                                        <li><a href=\"http://www.templatemo.com/page/1\">Web Templates</a></li>\n");
      out.write("                                                                                    </ul>\n");
      out.write("                                                                                </div>\n");
      out.write("                                    \n");
      out.write("                                                                                <div class=\"cleaner\"></div>\n");
      out.write("                                                                            </div>\n");
      out.write("                                    \n");
      out.write("                                                                        </div>-->\n");
      out.write("\n");
      out.write("                                    <div id=\"templatemo_copyright_wrapper\">\n");
      out.write("                                        <div id=\"templatemo_copyright\">\n");
      out.write("                                            <!--Copyright © 2048 <a href=\"#\">Your Company Name</a> | Designed by <a href=\"http://www.templatemo.com\" target=\"_parent\">Free CSS Templates</a>-->\n");
      out.write("                                        </div>\n");
      out.write("                                    </div>\n");
      out.write("\n");
      out.write("                                    </body>\n");
      out.write("                                    </html>");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }

  private boolean _jspx_meth_grd_gridpager_0(javax.servlet.jsp.tagext.JspTag _jspx_th_grd_dbgrid_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  grd:gridpager
    com.freeware.gridtag.GridPager _jspx_th_grd_gridpager_0 = (com.freeware.gridtag.GridPager) _jspx_tagPool_grd_gridpager_imgPrevious_imgNext_imgLast_imgFirst_nobody.get(com.freeware.gridtag.GridPager.class);
    _jspx_th_grd_gridpager_0.setPageContext(_jspx_page_context);
    _jspx_th_grd_gridpager_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_grd_dbgrid_0);
    _jspx_th_grd_gridpager_0.setImgFirst("images/First.gif");
    _jspx_th_grd_gridpager_0.setImgPrevious("images/Previous.gif");
    _jspx_th_grd_gridpager_0.setImgNext("images/Next.gif");
    _jspx_th_grd_gridpager_0.setImgLast("images/Last.gif");
    int _jspx_eval_grd_gridpager_0 = _jspx_th_grd_gridpager_0.doStartTag();
    if (_jspx_th_grd_gridpager_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_grd_gridpager_imgPrevious_imgNext_imgLast_imgFirst_nobody.reuse(_jspx_th_grd_gridpager_0);
      return true;
    }
    _jspx_tagPool_grd_gridpager_imgPrevious_imgNext_imgLast_imgFirst_nobody.reuse(_jspx_th_grd_gridpager_0);
    return false;
  }

  private boolean _jspx_meth_grd_textcolumn_0(javax.servlet.jsp.tagext.JspTag _jspx_th_grd_dbgrid_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  grd:textcolumn
    com.freeware.gridtag.TextColumn _jspx_th_grd_textcolumn_0 = (com.freeware.gridtag.TextColumn) _jspx_tagPool_grd_textcolumn_width_headerText_dataFormat_dataField_nobody.get(com.freeware.gridtag.TextColumn.class);
    _jspx_th_grd_textcolumn_0.setPageContext(_jspx_page_context);
    _jspx_th_grd_textcolumn_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_grd_dbgrid_0);
    _jspx_th_grd_textcolumn_0.setDataFormat("");
    _jspx_th_grd_textcolumn_0.setDataField("transectionno");
    _jspx_th_grd_textcolumn_0.setHeaderText("Transection No.");
    _jspx_th_grd_textcolumn_0.setWidth(5);
    int _jspx_eval_grd_textcolumn_0 = _jspx_th_grd_textcolumn_0.doStartTag();
    if (_jspx_th_grd_textcolumn_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_grd_textcolumn_width_headerText_dataFormat_dataField_nobody.reuse(_jspx_th_grd_textcolumn_0);
      return true;
    }
    _jspx_tagPool_grd_textcolumn_width_headerText_dataFormat_dataField_nobody.reuse(_jspx_th_grd_textcolumn_0);
    return false;
  }

  private boolean _jspx_meth_grd_textcolumn_1(javax.servlet.jsp.tagext.JspTag _jspx_th_grd_dbgrid_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  grd:textcolumn
    com.freeware.gridtag.TextColumn _jspx_th_grd_textcolumn_1 = (com.freeware.gridtag.TextColumn) _jspx_tagPool_grd_textcolumn_width_headerText_dataField_nobody.get(com.freeware.gridtag.TextColumn.class);
    _jspx_th_grd_textcolumn_1.setPageContext(_jspx_page_context);
    _jspx_th_grd_textcolumn_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_grd_dbgrid_0);
    _jspx_th_grd_textcolumn_1.setDataField("id");
    _jspx_th_grd_textcolumn_1.setHeaderText("User Id");
    _jspx_th_grd_textcolumn_1.setWidth(2);
    int _jspx_eval_grd_textcolumn_1 = _jspx_th_grd_textcolumn_1.doStartTag();
    if (_jspx_th_grd_textcolumn_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_grd_textcolumn_width_headerText_dataField_nobody.reuse(_jspx_th_grd_textcolumn_1);
      return true;
    }
    _jspx_tagPool_grd_textcolumn_width_headerText_dataField_nobody.reuse(_jspx_th_grd_textcolumn_1);
    return false;
  }

  private boolean _jspx_meth_grd_textcolumn_2(javax.servlet.jsp.tagext.JspTag _jspx_th_grd_dbgrid_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  grd:textcolumn
    com.freeware.gridtag.TextColumn _jspx_th_grd_textcolumn_2 = (com.freeware.gridtag.TextColumn) _jspx_tagPool_grd_textcolumn_width_headerText_dataField_nobody.get(com.freeware.gridtag.TextColumn.class);
    _jspx_th_grd_textcolumn_2.setPageContext(_jspx_page_context);
    _jspx_th_grd_textcolumn_2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_grd_dbgrid_0);
    _jspx_th_grd_textcolumn_2.setDataField("usertransection");
    _jspx_th_grd_textcolumn_2.setHeaderText("User Transection No.");
    _jspx_th_grd_textcolumn_2.setWidth(7);
    int _jspx_eval_grd_textcolumn_2 = _jspx_th_grd_textcolumn_2.doStartTag();
    if (_jspx_th_grd_textcolumn_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_grd_textcolumn_width_headerText_dataField_nobody.reuse(_jspx_th_grd_textcolumn_2);
      return true;
    }
    _jspx_tagPool_grd_textcolumn_width_headerText_dataField_nobody.reuse(_jspx_th_grd_textcolumn_2);
    return false;
  }

  private boolean _jspx_meth_grd_textcolumn_3(javax.servlet.jsp.tagext.JspTag _jspx_th_grd_dbgrid_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  grd:textcolumn
    com.freeware.gridtag.TextColumn _jspx_th_grd_textcolumn_3 = (com.freeware.gridtag.TextColumn) _jspx_tagPool_grd_textcolumn_width_headerText_dataField_nobody.get(com.freeware.gridtag.TextColumn.class);
    _jspx_th_grd_textcolumn_3.setPageContext(_jspx_page_context);
    _jspx_th_grd_textcolumn_3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_grd_dbgrid_0);
    _jspx_th_grd_textcolumn_3.setDataField("trantype");
    _jspx_th_grd_textcolumn_3.setHeaderText("Transection Type");
    _jspx_th_grd_textcolumn_3.setWidth(7);
    int _jspx_eval_grd_textcolumn_3 = _jspx_th_grd_textcolumn_3.doStartTag();
    if (_jspx_th_grd_textcolumn_3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_grd_textcolumn_width_headerText_dataField_nobody.reuse(_jspx_th_grd_textcolumn_3);
      return true;
    }
    _jspx_tagPool_grd_textcolumn_width_headerText_dataField_nobody.reuse(_jspx_th_grd_textcolumn_3);
    return false;
  }

  private boolean _jspx_meth_grd_textcolumn_4(javax.servlet.jsp.tagext.JspTag _jspx_th_grd_dbgrid_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  grd:textcolumn
    com.freeware.gridtag.TextColumn _jspx_th_grd_textcolumn_4 = (com.freeware.gridtag.TextColumn) _jspx_tagPool_grd_textcolumn_width_headerText_dataField_nobody.get(com.freeware.gridtag.TextColumn.class);
    _jspx_th_grd_textcolumn_4.setPageContext(_jspx_page_context);
    _jspx_th_grd_textcolumn_4.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_grd_dbgrid_0);
    _jspx_th_grd_textcolumn_4.setDataField("amount");
    _jspx_th_grd_textcolumn_4.setHeaderText("Amount");
    _jspx_th_grd_textcolumn_4.setWidth(3);
    int _jspx_eval_grd_textcolumn_4 = _jspx_th_grd_textcolumn_4.doStartTag();
    if (_jspx_th_grd_textcolumn_4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_grd_textcolumn_width_headerText_dataField_nobody.reuse(_jspx_th_grd_textcolumn_4);
      return true;
    }
    _jspx_tagPool_grd_textcolumn_width_headerText_dataField_nobody.reuse(_jspx_th_grd_textcolumn_4);
    return false;
  }

  private boolean _jspx_meth_grd_textcolumn_5(javax.servlet.jsp.tagext.JspTag _jspx_th_grd_dbgrid_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  grd:textcolumn
    com.freeware.gridtag.TextColumn _jspx_th_grd_textcolumn_5 = (com.freeware.gridtag.TextColumn) _jspx_tagPool_grd_textcolumn_width_headerText_dataField_nobody.get(com.freeware.gridtag.TextColumn.class);
    _jspx_th_grd_textcolumn_5.setPageContext(_jspx_page_context);
    _jspx_th_grd_textcolumn_5.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_grd_dbgrid_0);
    _jspx_th_grd_textcolumn_5.setDataField("datetime");
    _jspx_th_grd_textcolumn_5.setHeaderText("transection Date & Time");
    _jspx_th_grd_textcolumn_5.setWidth(5);
    int _jspx_eval_grd_textcolumn_5 = _jspx_th_grd_textcolumn_5.doStartTag();
    if (_jspx_th_grd_textcolumn_5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_grd_textcolumn_width_headerText_dataField_nobody.reuse(_jspx_th_grd_textcolumn_5);
      return true;
    }
    _jspx_tagPool_grd_textcolumn_width_headerText_dataField_nobody.reuse(_jspx_th_grd_textcolumn_5);
    return false;
  }
}
