<%@ page language="java" contentType="text/html; charset=UTF-8"
	isELIgnored="false" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
<head>
	<title>Video Game News, Game News, Entertainment News - Game Sport</title>
	<jsp:include page="../import/importHeader.jsp"></jsp:include>
</head>
<body>
	<div class="wrapper">
		<c:set var="rootName" value="${ pageContext.request.contextPath }" />
		
		<!-- ================================= Load header ============================================ -->
		<jsp:include page="../import/header.jsp"></jsp:include>
		<!-- ============================== End Load header =========================================== -->

		<!-- =================================== Section_1 ============================================ -->
		<section class="section first-section">
         <div class="container-fluid">
            <div class="masonry-blog clearfix">

               <div class="first-slot">
                  <div class="masonry-box post-media">
                     <img src="<c:url value="${ topPost.get(0).image }" />" alt="" class="img-fluid" style="height: 370px">
                     <div class="shadoweffect">
                        <div class="shadow-desc">
                           <div class="blog-meta">
                              <h4>
                                 <a href="${ rootName }/articles/<c:out value="${ topPost.get(0).shortTitle }" />/<c:out value="${ topPost.get(0).postId }" />" title="">
                                 	<c:out value="${ topPost.get(0).title }" />
                                 </a>
                              </h4>
                              <small>
                              	<a href="tech-single.html" title=""> <c:out value="${ topPost.get(0).stringTime }" /></a>
                              </small>
                              <small>
                              	<a href="tech-author.html" title="">by <c:out value="${ topAuthorName.get(0) }" /></a>
                             	</small>
                           </div>
                           <!-- end meta -->
                        </div>
                        <!-- end shadow-desc -->
                     </div>
                     <!-- end shadow -->
                  </div>
                  <!-- end post-media -->
               </div>
               <!-- end first-side -->

               <div class="second-slot">
                  <div class="masonry-box post-media">
                     <img src="<c:url value="${ topPost.get(1).image }" />" alt="" class="img-fluid" style="height: 370px">
                     <div class="shadoweffect">
                        <div class="shadow-desc">
                           <div class="blog-meta">
                              <h4>
                                 <a href="${ rootName }/articles/<c:out value="${ topPost.get(1).shortTitle }" />/<c:out value="${ topPost.get(1).postId }" />" title="">
                                 	<c:out value="${ topPost.get(1).title }" />
                                 </a>
                              </h4>
                              <small><a href="tech-single.html" title="">
                                    <c:out value="${ topPost.get(1).stringTime }" /></a></small> <small><a
                                    href="tech-author.html" title="">by <c:out value="${ topAuthorName.get(1) }" /></a></small>
                           </div>
                           <!-- end meta -->
                        </div>
                        <!-- end shadow-desc -->
                     </div>
                     <!-- end shadow -->
                  </div>
                  <!-- end post-media -->
               </div>
               <!-- end second-side -->

               <div class="last-slot">
                  <div class="masonry-box post-media">
                     <img src="<c:url value="${ topPost.get(2).image }" />" alt="" class="img-fluid" style="height: 370px">
                     <div class="shadoweffect">
                        <div class="shadow-desc">
                           <div class="blog-meta">
                              <h4>
                                 <a href="${ rootName }/articles/<c:out value="${ topPost.get(2).shortTitle }" />/<c:out value="${ topPost.get(2).postId }" />" title="">
                                 	<c:out value="${ topPost.get(2).title }" />
                                 </a>
                              </h4>
                              <small><a href="tech-single.html" title="">
                                    <c:out value="${ topPost.get(2).stringTime }" /></a></small> <small><a
                                    href="tech-author.html" title="">by <c:out value="${ topAuthorName.get(2) }" /></a></small>
                           </div>
                           <!-- end meta -->
                        </div>
                        <!-- end shadow-desc -->
                     </div>
                     <!-- end shadow -->
                  </div>
                  <!-- end post-media -->
               </div>
               <!-- end second-side -->

            </div>
            <!-- end masonry -->
         </div>
      </section>
		<!-- ================================= End Section_1 ========================================== -->
		
		<!-- =================================== Section_2 ============================================ -->
		<section class="section">
			<div class="container">
				<div class="row">
					<div class="col-lg-9 col-md-12 col-sm-12 col-xs-12">
						<div class="page-wrapper">
							<div class="blog-top clearfix">
								<h4 class="pull-left">
									Recent News <a href="#"><i class="fa fa-rss"></i></a>
								</h4>
							</div>

							<div class="blog-list clearfix">
								<c:if test="${ not empty listPost }">
									<c:forEach var="post" items="${ listPost }" varStatus="status">
										<div class="blog-box row">
										
											<div class="col-md-4">
												<div class="post-media">
													<a href="tech-single.html" title="">
														<img src="<c:url value="${ post.image }" />" alt="" class="img-fluid">
														<div class="hovereffect"></div>
													</a>
												</div>
											</div>
		
											<div class="blog-meta big-meta col-md-8">
												<h4>
													<a href="${ rootName }/articles/<c:out value="${ post.shortTitle }" />/<c:out value="${ post.postId }" />" title="">
		                                 	<c:out value="${ post.title }" />
		                                 </a>
												</h4>
												<p>${ post.description }</p>
												<!-- <small class="firstsmall"><a class="bg-orange" href="tech-category-01.html" title="">Gadgets</a></small> -->
												<small><a href="tech-single.html" title="">${ post.stringTime }</a></small>
												<small><a href="tech-author.html" title="">by ${ listAuthorName[status.index] }</a></small>
												<small><a href="tech-single.html" title=""><i class="fa fa-eye"></i>${ post.views }</a></small>
											</div>
										</div>
										
										<hr class="invis">
									</c:forEach>
								</c:if>
							</div>
						</div>

						<hr class="invis">

						<div class="row">
							<div class="col-md-12">
								<nav aria-label="Page navigation">
									<ul class="pagination justify-content-start">
										<li class="page-item"><a class="page-link" href="#">1</a></li>
										<li class="page-item"><a class="page-link" href="#">2</a></li>
										<li class="page-item"><a class="page-link" href="#">3</a></li>
										<li class="page-item"><a class="page-link" href="#">Next</a>
										</li>
									</ul>
								</nav>
							</div>
							<!-- end col -->
						</div>
					</div>

					<div class="col-lg-3 col-md-12 col-sm-12 col-xs-12">
						<div class="sidebar">
							<div class="widget">
								<div class="banner-spot clearfix">
									<div class="banner-img">
										<img src="upload/banner_07.jpg" alt="" class="img-fluid">
									</div>
									<!-- end banner-img -->
								</div>
								<!-- end banner -->
							</div>
							<!-- end widget -->

							<div class="widget">
								<h2 class="widget-title">Trend Videos</h2>
								<div class="trend-videos">
									<div class="blog-box">
										<div class="post-media">
											<a href="tech-single.html" title=""> <img
												src="upload/tech_video_01.jpg" alt="" class="img-fluid">
												<div class="hovereffect">
													<span class="videohover"></span>
												</div> <!-- end hover -->
											</a>
										</div>
										<!-- end media -->
										<div class="blog-meta">
											<h4>
												<a href="tech-single.html" title="">We prepared the best
													10 laptop presentations for you</a>
											</h4>
										</div>
										<!-- end meta -->
									</div>
									<!-- end blog-box -->

									<hr class="invis">

									<div class="blog-box">
										<div class="post-media">
											<a href="tech-single.html" title=""> <img
												src="upload/tech_video_02.jpg" alt="" class="img-fluid">
												<div class="hovereffect">
													<span class="videohover"></span>
												</div> <!-- end hover -->
											</a>
										</div>
										<!-- end media -->
										<div class="blog-meta">
											<h4>
												<a href="tech-single.html" title="">We are guests of ABC
													Design Studio - Vlog</a>
											</h4>
										</div>
										<!-- end meta -->
									</div>
									<!-- end blog-box -->

									<hr class="invis">

									<div class="blog-box">
										<div class="post-media">
											<a href="tech-single.html" title=""> <img
												src="upload/tech_video_03.jpg" alt="" class="img-fluid">
												<div class="hovereffect">
													<span class="videohover"></span>
												</div> <!-- end hover -->
											</a>
										</div>
										<!-- end media -->
										<div class="blog-meta">
											<h4>
												<a href="tech-single.html" title="">Both blood pressure
													monitor and intelligent clock</a>
											</h4>
										</div>
										<!-- end meta -->
									</div>
									<!-- end blog-box -->
								</div>
								<!-- end videos -->
							</div>
							<!-- end widget -->

							<div class="widget">
								<h2 class="widget-title">Popular Posts</h2>
								<div class="blog-list-widget">
									<div class="list-group">
										<a href="tech-single.html"
											class="list-group-item list-group-item-action flex-column align-items-start">
											<div class="w-100 justify-content-between">
												<img src="upload/tech_blog_08.jpg" alt=""
													class="img-fluid float-left">
												<h5 class="mb-1">5 Beautiful buildings you need..</h5>
												<small>12 Jan, 2016</small>
											</div>
										</a> <a href="tech-single.html"
											class="list-group-item list-group-item-action flex-column align-items-start">
											<div class="w-100 justify-content-between">
												<img src="upload/tech_blog_01.jpg" alt=""
													class="img-fluid float-left">
												<h5 class="mb-1">Let's make an introduction for..</h5>
												<small>11 Jan, 2016</small>
											</div>
										</a> <a href="tech-single.html"
											class="list-group-item list-group-item-action flex-column align-items-start">
											<div class="w-100 last-item justify-content-between">
												<img src="upload/tech_blog_03.jpg" alt=""
													class="img-fluid float-left">
												<h5 class="mb-1">Did you see the most beautiful..</h5>
												<small>07 Jan, 2016</small>
											</div>
										</a>
									</div>
								</div>
								<!-- end blog-list -->
							</div>
							<!-- end widget -->

							<div class="widget">
								<h2 class="widget-title">Recent Reviews</h2>
								<div class="blog-list-widget">
									<div class="list-group">
										<a href="tech-single.html"
											class="list-group-item list-group-item-action flex-column align-items-start">
											<div class="w-100 justify-content-between">
												<img src="upload/tech_blog_02.jpg" alt=""
													class="img-fluid float-left">
												<h5 class="mb-1">Banana-chip chocolate cake recipe..</h5>
												<span class="rating"> <i class="fa fa-star"></i> <i
													class="fa fa-star"></i> <i class="fa fa-star"></i> <i
													class="fa fa-star"></i> <i class="fa fa-star"></i>
												</span>
											</div>
										</a> <a href="tech-single.html"
											class="list-group-item list-group-item-action flex-column align-items-start">
											<div class="w-100 justify-content-between">
												<img src="upload/tech_blog_03.jpg" alt=""
													class="img-fluid float-left">
												<h5 class="mb-1">10 practical ways to choose organic..</h5>
												<span class="rating"> <i class="fa fa-star"></i> <i
													class="fa fa-star"></i> <i class="fa fa-star"></i> <i
													class="fa fa-star"></i> <i class="fa fa-star"></i>
												</span>
											</div>
										</a> <a href="tech-single.html"
											class="list-group-item list-group-item-action flex-column align-items-start">
											<div class="w-100 last-item justify-content-between">
												<img src="upload/tech_blog_07.jpg" alt=""
													class="img-fluid float-left">
												<h5 class="mb-1">We are making homemade ravioli..</h5>
												<span class="rating"> <i class="fa fa-star"></i> <i
													class="fa fa-star"></i> <i class="fa fa-star"></i> <i
													class="fa fa-star"></i> <i class="fa fa-star"></i>
												</span>
											</div>
										</a>
									</div>
								</div>
								<!-- end blog-list -->
							</div>
							<!-- end widget -->

							<div class="widget">
								<h2 class="widget-title">Follow Us</h2>

								<div class="row text-center">
									<div class="col-lg-3 col-md-3 col-sm-3 col-xs-6">
										<a href="#" class="social-button facebook-button"> <i
											class="fa fa-facebook"></i>
											<p>27k</p>
										</a>
									</div>

									<div class="col-lg-3 col-md-3 col-sm-3 col-xs-6">
										<a href="#" class="social-button twitter-button"> <i
											class="fa fa-twitter"></i>
											<p>98k</p>
										</a>
									</div>

									<div class="col-lg-3 col-md-3 col-sm-3 col-xs-6">
										<a href="#" class="social-button google-button"> <i
											class="fa fa-google-plus"></i>
											<p>17k</p>
										</a>
									</div>

									<div class="col-lg-3 col-md-3 col-sm-3 col-xs-6">
										<a href="#" class="social-button youtube-button"> <i
											class="fa fa-youtube"></i>
											<p>22k</p>
										</a>
									</div>
								</div>
							</div>
							<!-- end widget -->

							<div class="widget">
								<div class="banner-spot clearfix">
									<div class="banner-img">
										<img src="upload/banner_03.jpg" alt="" class="img-fluid">
									</div>
									<!-- end banner-img -->
								</div>
								<!-- end banner -->
							</div>
							<!-- end widget -->
						</div>
						<!-- end sidebar -->
					</div>
				</div>
			</div>
		</section>
		<!-- ================================= End Section_2 ========================================== -->


		<!-- ================================== Up arrow =============================================== -->
		<div class="dmtop">Scroll to Top</div>
		<!-- ================================ End Up arrow ============================================= -->


		<!-- ================================== Load footer =========================================== -->
		<jsp:include page="../import/footer.jsp"></jsp:include>
		<!-- ================================ End Load footer ========================================= -->

		<!-- ================================ Import js file ========================================== -->
		<jsp:include page="../import/importJS.jsp"></jsp:include>
		<!-- ============================== End Import js file ======================================== -->
	</div>
</body>
</html>