package com.example.ElectionDemo.helpers;

import com.example.ElectionDemo.controllers.candidates.Candidate;
import com.example.ElectionDemo.dao.CandidateDao;

/**
 * Author: Tukhtaboy Jumaniyazov
 * Date: 5/3/2021 9:43 PM
 */
public class AuthHelper {
    public static boolean isAllowed(String username, String password) {
        return (username.contentEquals("admin") && password.contentEquals("admin")) || (CandidateDao.existCandidate(username) && password.contentEquals("1234"));
    }
}
