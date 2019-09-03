<%@ page contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page session="false"%>

<div id="sidebar">
	<div class="inner">

		<!-- Search -->
		<section id="search" class="alt">
			<form method="post" action="#">
				<input type="text" name="query" id="query" placeholder="Search" />
			</form>
		</section>
		
		<!-- Menu -->
		<nav id="menu">
			<header class="major">
				<h2>category</h2>
			</header>
			<ul >
			
			
			<c:if test="${not empty categoryList}">
				<c:forEach var="categoryInfo" items="${categoryList}" varStatus="i">
					<li>
						<a href="/board/boardList/${categoryInfo.CTG_ID}/${categoryInfo.CTG_DEPTH}">
							<c:choose>
						        <c:when test="${categoryInfo.CTG_DEPTH eq '1'}">
						            <h2 style="font-size:15px;">${categoryInfo.CTG_NM}</h2>
						        </c:when>         
						        <c:otherwise>
						            <h2 style="font-size:10px;">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;- &nbsp;${categoryInfo.CTG_NM}</h4>
								</c:otherwise>
						    </c:choose>
							
						</a>
					</li>
				</c:forEach>
			</c:if>
			
			</ul>
		</nav>


		<!-- Section -->
		<section>
			<header class="major">
				<h2>home</h2>
			</header>
			<div class="mini-posts">
				<article>
					<a href="#" class="image"><img src="/resources/images/pic07.jpg" alt="" /></a>
					<!-- <p>Aenean ornare velit lacus, ac varius enim lorem ullamcorper dolore aliquam.</p> -->
				</article>
			</div>
		<!-- 	<ul class="actions">
				<li><a href="#" class="button">More</a></li>
			</ul> -->
		</section>
		
		<!-- Section -->
		<section>
			<header class="major">
				<h2>home</h2>
			</header>
			<div class="mini-posts">
				<article>
					<a href="#" class="image"><img src="/resources/images/pic07.jpg" alt="" /></a>
					<p>Aenean ornare velit lacus, ac varius enim lorem ullamcorper dolore aliquam.</p>
				</article>
				<article>
					<a href="#" class="image"><img src="/resources/images/pic08.jpg" alt="" /></a>
					<p>Aenean ornare velit lacus, ac varius enim lorem ullamcorper dolore aliquam.</p>
				</article>
				<article>
					<a href="#" class="image"><img src="/resources/images/pic09.jpg" alt="" /></a>
					<p>Aenean ornare velit lacus, ac varius enim lorem ullamcorper dolore aliquam.</p>
				</article>
			</div>
			<ul class="actions">
				<li><a href="#" class="button">More</a></li>
			</ul>
		</section>

		<!-- Section -->
		<section>
			<header class="major">
				<h2>Get in touch</h2>
			</header>
			<p>Sed varius enim lorem ullamcorper dolore aliquam aenean ornare velit lacus, ac varius enim lorem ullamcorper dolore. Proin sed aliquam facilisis ante interdum. Sed nulla amet lorem feugiat tempus aliquam.</p>
			<ul class="contact">
				<li class="icon solid fa-envelope"><a href="#">information@untitled.tld</a></li>
				<li class="icon solid fa-phone">(000) 000-0000</li>
				<li class="icon solid fa-home">1234 Somewhere Road #8254<br />
				Nashville, TN 00000-0000</li>
			</ul>
		</section>

		<footer id="footer">
			<p class="copyright">&copy; Untitled. All rights reserved. Demo Images: <a href="https://unsplash.com">Unsplash</a>. Design: <a href="https://html5up.net">HTML5 UP</a>.</p>
		</footer>

	</div>
</div>
