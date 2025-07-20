# Install and load the ggplot2 package
install.packages("ggplot2")
library(ggplot2)

# Scatter Plot
# Create a data frame with example data
data <- data.frame(x = c(1, 2, 3, 4, 5),
                   y = c(3, 5, 4, 6, 8))

# Create the scatter plot using ggplot2
ggplot(data, aes(x = x, y = y)) +
  geom_point(col = "red") +
  labs(x = "X-axis", y = "Y-axis", title = "Scatter Plot")

# Create the line graph using ggplot2
ggplot(data, aes(x = x, y = y)) +
  geom_line(col = "red") +
  labs(x = "X-axis", y = "Y-axis", title = "Line Graph")


# Bar Graps

data_1 <- data.frame(category = c("A", "B", "C", "D"),
                   value = c(10, 15, 7, 12))

# Create the bar graph using ggplot2
ggplot(data_1, aes(x = category, y = value)) +
  geom_bar(stat = "identity",fill  = "cyan") +
  labs(x = "Category", y = "Value", title = "Bar Graph")

# Pie Chart
data_2 <- data.frame(category = c("A", "B", "C", "D","E"),
                   value = c(30, 20, 15, 35,100))

# Create the pie-like chart using ggplot2
ggplot(data_2, aes(x = "", y = value, fill = category)) +
  geom_bar(stat = "identity", width = 1) +
  coord_polar(theta = "y") +
  labs(fill = "Category", title = "Pie-like Chart") +
  theme_void()

# Histogramm

data_3 <- data.frame(values = c(10, 20, 15, 30, 25, 18, 12, 28, 22))

# Create the histogram using ggplot2
ggplot(data_3, aes(x = values)) +
  geom_histogram(binwidth = 5, fill = "grey", color = "black") +
  labs(x = "Values", y = "Frequency", title = "Histogram")

# Box - Plot

# Create a data frame with example data
data <- data.frame(group = rep(c("Group 1", "Group 2", "Group 3"), each = 100),
                   value = c(rnorm(100), rnorm(100, mean = 2), rnorm(100, mean = 3)))

# Create the box plot using ggplot2
ggplot(data, aes(x = group, y = value)) +
  geom_boxplot() +
  labs(x = "Group", y = "Value", title = "Box Plot")

# Heat Map

# Create a data frame with example data
data <- data.frame(
  x = rep(letters[1:5], 5),
  y = rep(letters[1:5], each = 5),
  value = rnorm(25)
)

# Create the heatmap using ggplot2
ggplot(data, aes(x = x, y = y, fill = value)) +
  geom_tile() +
  scale_fill_gradient(low = "blue", high = "red") +
  labs(x = "X-axis", y = "Y-axis", title = "Heatmap")

# Violoin Plot

# Create a data frame with example data
data <- data.frame(
  group = rep(c("Group 1", "Group 2"), each = 100),
  value = c(rnorm(100), rnorm(100, mean = 2))
)

# Create the violin plot using ggplot2
ggplot(data, aes(x = group, y = value, fill = group)) +
  geom_violin() +
  labs(x = "Group", y = "Value", title = "Violin Plot")

# Area Chart

# Create a data frame with example data
data <- data.frame(
  year = c(2010, 2011, 2012, 2013, 2014),
  value1 = c(3, 4, 5, 6, 8),
  value2 = c(2, 3, 4, 5, 6)
)

# Reshape the data into long format
library(tidyr)
data_long <- gather(data, key = "variable", value = "value", -year)

# Create the area chart using ggplot2
ggplot(data_long, aes(x = year, y = value, fill = variable)) +
  geom_area() +
  labs(x = "Year", y = "Value", title = "Area Chart")

# Network Chart

# Create a graph object using the igraph package
edges <- data.frame(
  from = c("A", "B", "C", "D"),
  to = c("B", "C", "D", "A")
)
graph <- graph_from_data_frame(edges)

# Plot the network chart using ggraph
ggraph(graph, layout = "fr") +
  geom_edge_link() +
  geom_node_point() +
  geom_node_text(aes(label = name), vjust = 1.5) +
  theme_void()