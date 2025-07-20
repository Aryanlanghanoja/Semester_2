# Create a vector
vec <- c(3,2,4,1,5,2,3,5,2,3,5,1,2,3,4,2)

# Get the frequency table of the vector
freq_table <- table(vec)

# Order the values based on their frequency
ranked_vec <- names(sort(freq_table, decreasing = TRUE))

# Print the ranked vector
print(ranked_vec)

