<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ include file="/WEB-INF/views/template/header.jsp" %>

  <!-- Carousel
  ================================================== -->
  <head>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
        
  <style> 
  .carousel-inner img {
      width: 100%; /* Set width to 100% */
      margin: auto;
      min-height:300px;
      max-height:400px;
      background-color: #ff8080;
      
  }

  /* Hide the carousel text when the screen is less than 600 pixels wide */
  @media (max-width: 600px) {
    .carousel-caption {
      display: none;
      background-color: #ff8080;
      
    }
  }
  </style>
</head>
<body>
<div id="myCarousel" class="carousel slide" data-ride="carousel">
    <!-- Indicators -->
    <ol class="carousel-indicators">
      <li data-target="#myCarousel" data-slide-to="0" class="active"></li>
      <li data-target="#myCarousel" data-slide-to="1"></li>
       <li data-target="#myCarousel" data-slide-to="2"></li>
        <li data-target="#myCarousel" data-slide-to="3"></li>
    
    
    </ol>

    <!-- Wrapper for slides -->
    <div class="carousel-inner" role="listbox">
      <div class="item active">
        <img src="<c:url value="/resources/images/watches1.jpeg"/>" alt="Image">
        <div class="carousel-caption">
          <h3>Watch</h3>
          <p>Fastrack</p>
        </div>
      </div>

      <div class="item">
        <img src="<c:url value="/resources/images/perfume3.jpg"/>" alt="Image">
        <div class="carousel-caption">
          <h3> Scent </h3>
          <p>FOGG</p>
        </div>
      </div>
      
      <div class="item">
        <img src="<c:url value="/resources/images/watch3.jpg"/>" alt="Image">
        <div class="carousel-caption">
          <h3>Shoes </h3>
          <p>Lancer</p>
        </div>
        </div>
         <div class="item">
        <img src="<c:url value="/resources/images/shoes2.jpeg"/>" alt="Image">
        <div class="carousel-caption">
          <h3>Shoes </h3>
          <p>Reebok</p>
        </div>
        </div>
    </div>

    <!-- Left and right controls -->
    <a class="left carousel-control" href="#myCarousel" role="button" data-slide="prev">
      <span class="glyphicon glyphicon-chevron-left" aria-hidden="true"></span>
      <span class="sr-only">Previous</span>
    </a>
    <a class="right carousel-control" href="#myCarousel" role="button" data-slide="next">
      <span class="glyphicon glyphicon-chevron-right" aria-hidden="true"></span>
      <span class="sr-only">Next</span>
    </a>
</div>
  
<div class="container text-center">
  <h3> Products</h3><br>
  <div class="row">
    <div class="col-sm-4">
      <img src="<c:url value="/resources/images/shoe4.jpg"/>" style="width:100%" alt="Image">
      <p>Lancer product </p>
    </div>
    <div class="col-sm-4">
      <img src="<c:url value="/resources/images/shoes2.jpeg"/>" style="width:100%" alt="Image">
      <p>Reebok product</p>
    </div>
    <div class="col-sm-4">
      <div class="well">
       <p>Welcome to Our Shoppingcart.Its is a user friendly application.Its is easy to handled.</p>
      </div>
      <div class="well">
       <p>This application is developed by the Dt5 students from Dilshuknagar NIIT.</p>
      </div>
    </div>
  </div>
</div><br>
        

<%@ include file="/WEB-INF/views/template/footer.jsp" %>
