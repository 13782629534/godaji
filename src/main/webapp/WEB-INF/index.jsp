<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="yj" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8" />
<title></title>
<link href="css/bootstrap.min.css" type="text/css" rel="stylesheet" />
<style type="text/css">
#top {
	height: 100px;
	text-align: center;
	background-color: ghostwhite;
}

#left {
	height: 720px;
	border: 1px solid black;
}

#right {
	height: 720px;
}

#bottom {
	text-align: center;
	line-height: 50px;
	height: 50px;
	background-color: ghostwhite;
}
</style>
</head>
<body>
	<div class="container-fluid">


		<!-- 顶部 -->
		<div class="row">
			<div class="col-md-12" id="top">
				<h1>逛大集商户后台管理系统</h1>
				<h6 align=right>用户<font size=4px>
				
				<!-- 显示当前登录的用户 -->
				<%-- <yj:choose>
					<yj:when test="${empty sessionScope.userName}">
						<yj:redirect url="login.jsp"/>
					</yj:when>
					<yj:otherwise>
						${sessionScope.userName}
					</yj:otherwise>
				</yj:choose> --%>
				</font>在线&nbsp&nbsp&nbsp<a href="exit.do">安全退出</a>
				
			</div>
		</div>


		<!-- 中间 -->
		<div class="row">
			<!-- 左边-->
			<div class="col-md-3 col-sm-3 col-xs-3" id="left">
					<!-- 教学主管模块 -->
					<div class="panel panel-default">
						<div class="panel-heading">
							<h4 class="panel-title">
								<a data-toggle="collapse" data-toggle="collapse"
									data-parent="#accordion" href="#collapseOne"> 基础资料管理 </a>
							</h4>
						</div>
						
						<div id="collapseOne" class="panel-collapse collapse in">
							<div class="panel-body">
								<ul>
									<li><a href="#" target="ifs">商户基本信息</a></li>
								
									<li><a href="findAllG.action" target="ifs">店内商品分类管理</a></li>

									<li><a href="#" target="ifs">商品管理</a></li>
									<li><a href="#" target="ifs">人员管理</a></li>
									<li><a href="#" target="ifs">快递模板</a></li>
									<li><a href="#" target="ifs">库存管理</a></li>
									<li><a href="#" target="ifs">优惠券管理</a></li>
								</ul>
							</div>
						</div>
						
					</div>

					<!-- 教师模块-->
					<div class="panel panel-default">
						<div class="panel-heading">
							<h4 class="panel-title">
								<a data-toggle="collapse" data-toggle="collapse"
									data-parent="#accordion" href="#collapseTwo"> 订单管理 </a>
							</h4>
						</div>
						<div id="collapseTwo" class="panel-collapse collapse in">
							<div class="panel-body">
								<ul>
									<li><a href="findAllJ.action?Juid=1" target="ifs">未完成订单</a></li>
									<li><a href="#" target="ifs">已完成订单</a></li>
									<li><a href="#" target="ifs">待清算订单</a></li>
									<li><a href="#" target="ifs">已清算订单</a></li>
									<li><a href="#" target="ifs">退货订单</a></li>
								</ul>
							</div>
						</div>
					</div>
					
					<!-- 班主任模块 -->
					<div class="panel panel-default">
						<div class="panel-heading">
							<h4 class="panel-title">
								<a data-toggle="collapse" data-toggle="collapse"
									data-parent="#accordion" href="#collapseTwo"> 活动管理 </a>
							</h4>
						</div>
						<div id="collapseTwo" class="panel-collapse collapse in">
							<div class="panel-body">
								<ul>
									<li><a href="#" target="ifs">活动管理</a></li>
								</ul>
							</div>
						</div>
					</div>
					
					<!-- 学员模块 -->
					<div class="panel panel-default">
						<div class="panel-heading">
							<h4 class="panel-title">
								<a data-toggle="collapse" data-toggle="collapse"
									data-parent="#accordion" href="#collapseTwo"> 统计报表 </a>
							</h4>
						</div>
						<div id="collapseTwo" class="panel-collapse collapse in">
							<div class="panel-body">
								<ul>
									<li><a href="findOne.action?stuId=1" target="ifs">销售额分析报表</a></li>
									<li><a href="#" target="ifs">订单转化率报表</a></li>
								</ul>
							</div>
						</div>
					</div>
			
			
			
			</div>
			
			<!-- 右边-->
			<div class="col-md-9 col-sm-9 col-xs-9" id="right">
				<iframe name="ifs" width="100%" height="100%"></iframe>
			</div>
		</div>
		
		<!-- 底部 -->
		<div class="row" id="bottom">
			<div class="col-md-12">© 2019&nbsp&nbsp当前在线人数：${applicationScope.online}</div>
		</div>
	</div>

	<script src="js/jquery-1.12.3.min.js" type="text/javascript"></script>
	<script src="js/bootstrap.min.js" type="text/javascript"></script>

</body>
</html>