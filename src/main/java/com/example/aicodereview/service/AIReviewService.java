package com.example.aicodereview.service;

import org.springframework.stereotype.Service;

@Service
public class AIReviewService {

    public String reviewCode(String code) {

        StringBuilder feedback = new StringBuilder();
        int score = 100;

        feedback.append("AI Code Review Result:\n\n");

        // Time Complexity Check
        if (code.contains("for") || code.contains("while")) {
            feedback.append("✔ Loop detected. Estimated Time Complexity: O(n)\n");
            score -= 5;
        }

        if (code.contains("for") && code.indexOf("for") != code.lastIndexOf("for")) {
            feedback.append("⚠ Nested loop detected. Possible Time Complexity: O(n^2)\n");
            score -= 10;
        }

        // Main Method Check
        if (!code.contains("public static void main")) {
            feedback.append("⚠ No main method found.\n");
            score -= 10;
        } else {
            feedback.append("✔ Main method detected.\n");
        }

        // Comments Check
        if (!code.contains("//") && !code.contains("/*")) {
            feedback.append("⚠ No comments found in code.\n");
            score -= 10;
        } else {
            feedback.append("✔ Comments present.\n");
        }

        // General Suggestions
        feedback.append("\nSuggestions:\n");
        feedback.append("- Follow proper naming conventions.\n");
        feedback.append("- Follow SOLID principles.\n");
        feedback.append("- Use meaningful variable names.\n");

        feedback.append("\nCode Quality Score: ").append(score).append("/100\n");

        return feedback.toString();
    }
}