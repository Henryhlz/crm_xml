<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Frameset//EN" "http://www.w3c.org/TR/1999/REC-html401-19991224/frameset.dtd">
<HTML xmlns="http://www.w3.org/1999/xhtml">
<HEAD>
    <TITLE>客户关系管理系统</TITLE>
    <META http-equiv=Content-Type content="text/html; charset=utf-8">
    <META content="MSHTML 6.00.2900.3492" name=GENERATOR>


</HEAD>
<FRAMESET frameSpacing=0 rows=80,* frameBorder=0>
    <FRAME name=top src="top.htm" frameBorder=0 noResize scrolling=no>
    <FRAMESET frameSpacing=0 frameBorder=0 cols=220,*>
        <FRAME name=menu src="${pageContext.request.contextPath}/menu.jsp" frameBorder=0 noResize>
        <FRAME name=main src="${pageContext.request.contextPath}/welcome.htm" frameBorder=0>
    </FRAMESET>
    <NOFRAMES>
        <p>This page requires frames, but your browser does not support them.</p>
    </NOFRAMES>
    <!--动态背景-->
    <%--<script color="0,0,255" opacity='0.6' count="200" src="https://cdn.bootcss.com/canvas-nest.js/2.0.4/canvas-nest.js"></script>--%>
    <%--<canvas width="1362" height="1567" style="display: block; position: absolute; top: 0px; left: 0px; height: 100%; width: 100%; overflow: hidden; pointer-events: none; opacity: 0.6;"></canvas>--%>
</FRAMESET>
</HTML>
