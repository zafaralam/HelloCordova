<html>
	<body>
		<div> <% for (Tag tag : cloud.tags()) { %> <a href="<%= tag.getLink() %>" style="font-size: <%= tag.getWeight() %>px;"%gt;<%= tag.getName() %></a> <% } %> </div> 
	</body>
</html>